package chapter_3.exercise_1.sub_exercise_b;

import music_domain.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArtistsMapper {

    public static List<String> toNamesAndOrigins(Stream<Artist> artists) {
        return artists.map(artist -> artist.getName() + " " + artist.getNationality())
                .collect(Collectors.toList());
    }
}
