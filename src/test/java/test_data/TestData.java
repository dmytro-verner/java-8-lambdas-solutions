package test_data;

import music_domain.Album;
import music_domain.Artist;
import music_domain.Track;

import java.util.Arrays;
import java.util.Collections;

public class TestData {

    public static final Artist tomAraya = new Artist("Tom Araya", "USA");

    public static final Artist kerryKing = new Artist("Kerry King", "USA");

    public static final Artist jeffHanneman = new Artist("Jeff Hanneman", "USA");

    public static final Artist daveLombardo  = new Artist("Dave Lombardo", "USA");

    public static final Artist oceanElzy = new Artist("Ocean Elzy", "Ukraine");

    public static final Artist slayer = new Artist("Slayer",
            Arrays.asList(tomAraya, kerryKing, jeffHanneman, daveLombardo), "USA");

    public static final Album oneTrackAlbum = new Album(
            "Single album", Collections.singletonList(TestData.track1), Collections.EMPTY_LIST);

    public static final Album threeTracksAlbum = new Album("Three good songs", Arrays.asList(
            TestData.track1, TestData.track2, TestData.track3), Collections.EMPTY_LIST);

    public static final Album fourTracksAlbum = new Album("Quarter", Arrays.asList(
            TestData.track1, TestData.track2, TestData.track3, TestData.track4), Collections.EMPTY_LIST);

    public static final Track track1 = new Track("The Best of All", 124);

    public static final Track track2 = new Track("Out", 145);

    public static final Track track3 = new Track("Mostly Done", 90);

    public static final Track track4 = new Track("Never brake down", 230);
}
