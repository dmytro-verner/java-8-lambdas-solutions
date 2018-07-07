package chapter_4.exercise_3;

import music_domain.Artist;

import java.util.List;
import java.util.Optional;

public class RefactoredArtists {

    private List<Artist> artists;

    public RefactoredArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if(index < 0 || index >= artists.size())
            return Optional.empty();
        return Optional.of(artists.get(index));
    }

    public String getArtistName(int index) {
        return getArtist(index).map(Artist::getName).orElse("unknown");
    }
}
