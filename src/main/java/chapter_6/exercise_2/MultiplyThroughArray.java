package chapter_6.exercise_2;

import java.util.stream.IntStream;

public class MultiplyThroughArray {

    private static final int identity = 5;

    public static int multiplyThrough(IntStream linkedListOfNumbers) {
        return identity * linkedListOfNumbers.parallel()
            .reduce(1, (acc, x) -> x * acc);
    }
}
