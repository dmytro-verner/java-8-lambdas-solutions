package chapter_3.exercise_1.sub_exercise_a;

import java.util.stream.Stream;

public class IntegersSum {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, y) -> acc + y);
    }
}
