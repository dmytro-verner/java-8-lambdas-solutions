package chapter_6.exercise_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ParallelSumOfSquaresTest {

    @Test
    public void shouldSumSquaresOfNonEmptyStream() {
        int sumOfSquares = ParallelSum.sumOfSquares(IntStream.range(0, 1000));

        Assert.assertEquals(332833500, sumOfSquares);
    }

    @Test
    public void shouldReturnZeroOnEmptyStream() {
        int sumOfSquares = ParallelSum.sumOfSquares(IntStream.empty());

        Assert.assertEquals(0, sumOfSquares);
    }
}
