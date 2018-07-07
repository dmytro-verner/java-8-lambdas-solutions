package chapter_3.exercise_1.sub_exercise_c;

import music_domain.Album;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AlbumsFilter {

    public static List<Album> albumsWithAtMostThreeTracks(Stream<Album> albums) {
        return albums.filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }
}
