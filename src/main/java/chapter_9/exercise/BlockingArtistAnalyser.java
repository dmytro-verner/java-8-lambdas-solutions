package chapter_9.exercise;

import music_domain.Artist;

import java.util.function.Function;

public class BlockingArtistAnalyser {

    private final Function<String, Artist> artistLookupService;

    public BlockingArtistAnalyser(Function<String, Artist> artistLookupService) {
        this.artistLookupService = artistLookupService;
    }

    public boolean isLargerGroup(String artistName, String otherArtistName) {
        return getNumberOfMembers(artistName) > getNumberOfMembers(otherArtistName);
    }

    private long getNumberOfMembers(String artistName) {
        return artistLookupService.apply(artistName)
            .getMembers()
            .count();
    }
}
