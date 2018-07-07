package chapter_4.exercise_1;

import music_domain.Artist;
import org.junit.Test;
import test_data.TestData;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class PerformanceTest {

    @Test
    public void shouldReturnBandAndItsMembers() {
        Performance sut = new Performance() {
            @Override
            public String getName() {
                throw new UnsupportedOperationException();
            }

            @Override
            public Stream<Artist> getMusicians() {
                return Stream.of(TestData.slayer);
            }
        };

        List<Artist> allMusicians = sut.getAllMusicians().collect(toList());

        assertEquals(5, allMusicians.size());
    }
}
