package chapter_3.exercise_2;

import org.junit.Test;
import test_data.TestData;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class IterationWithStreamTest {

    @Test
    public void shouldCountBandMembers() {
        int countTotalMembers = IterationWithStream.countBandMembers(Stream.of(TestData.slayer));

        assertEquals(4, countTotalMembers);
    }

    @Test
    public void shouldCountEmptyStream() {
        int countBandMembers = IterationWithStream.countBandMembers(Stream.empty());

        assertEquals(0, countBandMembers);
    }
}
