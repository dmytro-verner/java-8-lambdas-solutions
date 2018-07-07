package chapter_3.exercise_1.sub_exercise_a;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class IntegersSumTest {

    @Test
    public void shouldAddUpMultipleIntegersWithPositiveSum() {
        Stream<Integer> integerStream = Stream.of(3, 2, 1);

        assertEquals(6, IntegersSum.addUp(integerStream));
    }

    @Test
    public void shouldAddUpMultipleIntegersWithNegativeSum() {
        Stream<Integer> integerStream = Stream.of(3, -2, -5);

        assertEquals(-4, IntegersSum.addUp(integerStream));
    }

    @Test
    public void shouldAddUpSinglePositiveInteger() {
        Stream<Integer> integerStream = Stream.of(3);

        assertEquals(3, IntegersSum.addUp(integerStream));
    }

    @Test
    public void shouldAddUpSingleNegativeInteger() {
        Stream<Integer> integerStream = Stream.of(-3);

        assertEquals(-3, IntegersSum.addUp(integerStream));
    }

    @Test
    public void shouldAddUpSingleZeroInteger() {
        Stream<Integer> integerStream = Stream.of(0);

        assertEquals(0, IntegersSum.addUp(integerStream));
    }

    @Test
    public void shouldAddUpEmptyList() {
        assertEquals(0, IntegersSum.addUp(Stream.empty()));
    }
}
