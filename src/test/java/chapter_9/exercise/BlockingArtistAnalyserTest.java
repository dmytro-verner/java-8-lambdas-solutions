package chapter_9.exercise;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BlockingArtistAnalyserTest {

    private BlockingArtistAnalyser blockingArtistAnalyser =
            new BlockingArtistAnalyser(new FakeLookupService()::lookupArtist);

    @Test
    public void largerGroupsShouldBeLarger() {
        assertTrue(blockingArtistAnalyser.isLargerGroup("Slayer", "Ocean Elzy"));
    }

    @Test
    public void smallerGroupShouldBeSmaller() {
        assertFalse(blockingArtistAnalyser.isLargerGroup("Ocean Elzy", "Slayer"));
    }
}
