package chapter_3.exercise_2;

import music_domain.Artist;

import java.util.stream.Stream;

public class IterationWithStream {

    public static int countBandMembers(Stream<Artist> artists) {
        return (int) artists.flatMap(Artist::getMembers).count();
    }
}
