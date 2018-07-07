package chapter_3.exercise_1.sub_exercise_c;

import music_domain.Album;
import org.junit.Test;
import test_data.TestData;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlbumsFilterTest {

    @SuppressWarnings("empty lists are not used")
    @Test
    public void shouldFilterOutAlbumsWithMoreThan3Tracks() {
        List<Album> albumsWithAtMostThreeTracks = AlbumsFilter.albumsWithAtMostThreeTracks(
                Stream.of(TestData.oneTrackAlbum, TestData.threeTracksAlbum, TestData.fourTracksAlbum));

        assertEquals(2, albumsWithAtMostThreeTracks.size());
        assertTrue(albumsWithAtMostThreeTracks.contains(TestData.oneTrackAlbum));
        assertTrue(albumsWithAtMostThreeTracks.contains(TestData.threeTracksAlbum));
    }
}
