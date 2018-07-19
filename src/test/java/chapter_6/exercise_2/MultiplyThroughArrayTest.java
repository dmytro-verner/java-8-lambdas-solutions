package chapter_6.exercise_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class MultiplyThroughArrayTest {

    @Test
    public void shouldMultiplyThroughAllNumbersAndIdentityNumber() {
        int multiplyThrough = MultiplyThroughArray.multiplyThrough(IntStream.range(1, 10));

        Assert.assertEquals(1814400, multiplyThrough);
    }

    @Test
    public void shouldReturnIdentityNumberOnEmptyStream() {
        int multiplyThrough = MultiplyThroughArray.multiplyThrough(IntStream.empty());

        Assert.assertEquals(5, multiplyThrough);
    }
}
