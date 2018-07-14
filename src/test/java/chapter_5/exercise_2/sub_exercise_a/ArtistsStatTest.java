package chapter_5.exercise_2.sub_exercise_a;

import music_domain.Artist;
import org.junit.Assert;
import org.junit.Test;
import test_data.TestData;

import java.util.stream.Stream;

public class ArtistsStatTest {

    @Test
    public void collectingShouldReturnArtistWithLongestName() {
        Artist artistWithLongestName = ArtistsStat.withLongestNameByCollecting(
                Stream.of(TestData.kerryKing, TestData.tomAraya, TestData.daveLombardo));

        Assert.assertEquals(TestData.daveLombardo, artistWithLongestName);
    }

    @Test
    public void maxByShouldReturnArtistWithLongestName() {
        Artist artistWithLongestName = ArtistsStat.withLongestNameByMax(
                Stream.of(TestData.kerryKing, TestData.tomAraya, TestData.daveLombardo));

        Assert.assertEquals(TestData.daveLombardo, artistWithLongestName);
    }

    @Test
    public void reducingShouldReturnArtistWithLongestName() {
        Artist artistWithLongestName = ArtistsStat.withLongestNameByReducing(
                Stream.of(TestData.kerryKing, TestData.tomAraya, TestData.daveLombardo));

        Assert.assertEquals(TestData.daveLombardo, artistWithLongestName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void collectingThrowsIAEOnEmptyStreamOfArtists() {
        ArtistsStat.withLongestNameByCollecting(Stream.empty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxByThrowsIAEOnEmptyStreamOfArtists() {
        ArtistsStat.withLongestNameByMax(Stream.empty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void reducingThrowsIAEOnEmptyStreamOfArtists() {
        ArtistsStat.withLongestNameByReducing(Stream.empty());
    }
}
