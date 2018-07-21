package chapter_9.exercise;

import music_domain.Artist;
import test_data.TestData;

public class FakeLookupService {

    public Artist lookupArtist(String name) {
        simulateLatency();

        switch (name) {
            case "Slayer":
                return TestData.slayer;
            case "Ocean Elzy":
                return TestData.oceanElzy;
            default:
                throw new IllegalArgumentException("Unknown artist with name of " + name);
        }
    }

    private void simulateLatency() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
