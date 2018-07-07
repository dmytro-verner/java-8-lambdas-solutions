package chapter_3.exercise_1.sub_exercise_b;

import music_domain.Artist;
import org.junit.Test;
import test_data.TestData;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArtistsMapperTest {

    @Test
    public void shouldMapToNameAndOrigin() {

        Stream<Artist> artists = Stream.of(TestData.tomAraya, TestData.oceanElzy);

        List<String> artistsNamesAndOrigins = ArtistsMapper.toNamesAndOrigins(artists);

        assertEquals(2 , artistsNamesAndOrigins.size());
        assertTrue(artistsNamesAndOrigins.contains(TestData.tomAraya.getName() + " " + TestData.tomAraya.getNationality()));
        assertTrue(artistsNamesAndOrigins.contains(TestData.oceanElzy.getName() + " " + TestData.oceanElzy.getNationality()));
    }
}
