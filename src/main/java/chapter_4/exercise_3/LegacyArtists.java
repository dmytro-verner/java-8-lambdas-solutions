package chapter_4.exercise_3;

import music_domain.Artist;

import java.util.List;

public class LegacyArtists {

    private List<Artist> artists;

    public LegacyArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Artist getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            indexException(index);
        }

        return artists.get(index);
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index + " doesn't contain Artist");
    }

    public String getArtistName(int index) {
        try {
            Artist artist = getArtist(index);
            return artist.getName();
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }
}
