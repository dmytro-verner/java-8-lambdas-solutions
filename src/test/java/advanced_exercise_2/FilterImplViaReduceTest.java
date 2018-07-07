package advanced_exercise_2;

import chapter_3.advanced_exercise_2.FilterImplViaReduce;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilterImplViaReduceTest {

    @Test
    public void shouldFilterWithProvidedPredicate() {
        List<Integer> mappedResult = FilterImplViaReduce.filter(Stream.of(0, 32, 12, 10, 40), i -> i > 20);

        assertEquals(2, mappedResult.size());
        assertTrue(mappedResult.contains(32));
        assertTrue(mappedResult.contains(40));
    }

    @Test
    public void shouldFilterEmptyList() {
        List<Integer> mappedResult = FilterImplViaReduce.filter(Stream.empty(), i -> i > 0);
    }
}
