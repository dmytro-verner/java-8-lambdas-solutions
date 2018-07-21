package chapter_9.exercise;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.assertEquals;

public class CompletableFutureArtistAnalyzerTest {

    private ArtistAnalyzer artistAnalyser =
            new CompletableFutureArtistAnalyser(new FakeLookupService()::lookupArtist);

    @Test
    public void largerGroupsShouldBeLarger() {
        assertLargerGroup("Slayer", "Ocean Elzy", true);
    }

    @Test
    public void smallerGroupsShouldBeSmaller() {
        assertLargerGroup("Ocean Elzy", "Slayer", false);
    }

    private void assertLargerGroup(String artistName, String otherArtistName, boolean expected) {
        AtomicBoolean isLarger = new AtomicBoolean(!expected);
        artistAnalyser.isLargerGroup(artistName, otherArtistName, isLarger::set);
        assertEquals(expected, isLarger.get());
    }
}
