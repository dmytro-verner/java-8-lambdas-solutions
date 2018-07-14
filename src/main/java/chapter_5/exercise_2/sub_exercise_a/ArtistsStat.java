package chapter_5.exercise_2.sub_exercise_a;

import music_domain.Artist;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;

public class ArtistsStat {

    private static Comparator<Artist> byNameLength = Comparator.comparing(artist -> artist.getName().length());

    public static Artist withLongestNameByCollecting(Stream<Artist> artists) {
        return artists
                .collect(maxBy(byNameLength))
                .orElseThrow(IllegalArgumentException::new);
    }

    public static Artist withLongestNameByMax(Stream<Artist> artists) {
        return artists
                .max(byNameLength)
                .orElseThrow(IllegalArgumentException::new);
    }

    public static Artist withLongestNameByReducing(Stream<Artist> artists) {
        return artists
                .reduce((acc, artist) -> byNameLength.compare(acc, artist) >= 0 ? acc : artist)
                .orElseThrow(IllegalArgumentException::new);
    }
}
