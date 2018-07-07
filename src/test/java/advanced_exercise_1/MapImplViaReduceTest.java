package advanced_exercise_1;

import chapter_3.advanced_exercise_1.MapImplViaReduce;
import music_domain.Artist;
import org.junit.Test;
import test_data.TestData;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapImplViaReduceTest {

    @Test
    public void shouldMapWithProvidedMapper() {
        List<String> mappedResult = MapImplViaReduce.map(Stream.of(TestData.kerryKing, TestData.oceanElzy, TestData.tomAraya), Artist::getName);

        assertEquals(3, mappedResult.size());
        assertTrue(mappedResult.contains(TestData.kerryKing.getName()));
        assertTrue(mappedResult.contains(TestData.oceanElzy.getName()));
        assertTrue(mappedResult.contains(TestData.tomAraya.getName()));
    }
}
