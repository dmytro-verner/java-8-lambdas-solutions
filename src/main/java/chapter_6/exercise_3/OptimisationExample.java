package chapter_6.exercise_3;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
public class OptimisationExample {

    public static void main(String[] ignore) throws IOException, RunnerException {
        final String[] args = {
                ".*OptimisationExample.*",
                "-wi",
                "10",
                "-i",
                "10",
                "-f",
                "1"
        };
        Main.main(args);
    }

    private List<Integer> listOfNumbers;

    @Setup
    public void init() {
        listOfNumbers = new ArrayList<>();
        addNumbers(listOfNumbers);
    }

    private void addNumbers(List<Integer> container) {
        IntStream.range(0, 10_000_000)
                .forEach(container::add);
    }

    @Benchmark
    public int slowSumOfSquares() {
        return listOfNumbers.stream()
                .map(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);
    }

    @Benchmark
    //it provides results that are worse than fastSumOfSquares() during warmup iterations
    //but then it can reach comparable results to fastSumOfSquares() as JVM optimizes the code,
    //supposedly jit substituting reduce with sum()
    public int intermediateSumOfSquares() {
        return listOfNumbers.parallelStream()
                .mapToInt(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);
    }

    @Benchmark
    public int fastSumOfSquares() {
        return listOfNumbers.parallelStream()
                .mapToInt(x -> x * x)
                .sum();
    }
}
