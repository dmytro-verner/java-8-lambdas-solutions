package chapter_4.exercise_1;

import music_domain.Artist;

import java.util.stream.Stream;

interface Performance {

    String getName();

    Stream<Artist> getMusicians();

    default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(
                artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }
}
