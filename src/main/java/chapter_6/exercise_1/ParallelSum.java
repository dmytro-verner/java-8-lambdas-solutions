package chapter_6.exercise_1;

import java.util.stream.IntStream;

public class ParallelSum {

    public static int sumOfSquares(IntStream range) {
        return range.parallel()
                .map(x -> x * x)
                .sum();
    }
}
