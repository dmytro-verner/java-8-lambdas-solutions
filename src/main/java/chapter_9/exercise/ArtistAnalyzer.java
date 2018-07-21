package chapter_9.exercise;

import java.util.function.Consumer;

public interface ArtistAnalyzer {

    public void isLargerGroup(String artistName, String otherArtistName,
                              Consumer<Boolean> handler);
}
