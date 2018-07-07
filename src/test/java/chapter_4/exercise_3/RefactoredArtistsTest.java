package chapter_4.exercise_3;

import music_domain.Artist;
import org.junit.Before;
import org.junit.Test;
import test_data.TestData;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.*;

public class RefactoredArtistsTest {

    private RefactoredArtists refactoredArtists;

    @Before
    public void setUp() {
        refactoredArtists = new RefactoredArtists(Arrays.asList(
                TestData.daveLombardo, TestData.jeffHanneman, TestData.kerryKing));
    }

    @Test
    public void shouldReturnArtistByValidIndex() {
        Optional<Artist> artistByIndex = refactoredArtists.getArtist(2);

        assertTrue(artistByIndex.isPresent());
        assertEquals(TestData.kerryKing, artistByIndex.get());
    }

    @Test
    public void shouldReturnArtistEmptyOptionalOnIndexMoreThanListSize() {
        Optional<Artist> artistByIndex = refactoredArtists.getArtist(3);

        assertFalse(artistByIndex.isPresent());
    }

    @Test
    public void shouldReturnArtistOptionalOnIndexLessThanZero() {
        Optional<Artist> artistByIndex = refactoredArtists.getArtist(-1);

        assertFalse(artistByIndex.isPresent());
    }

    @Test
    public void shouldReturnArtistEmptyOptionalOnValidIndexingEmptyList() {
        RefactoredArtists refactoredEmptyArtists = new RefactoredArtists(Collections.EMPTY_LIST);

        Optional<Artist> artistByIndex = refactoredEmptyArtists.getArtist(0);

        assertFalse(artistByIndex.isPresent());
    }

    @Test
    public void shouldReturnArtistNameOnCorrectIndex() {
        String artistNameByIndex = refactoredArtists.getArtistName(2);

        assertEquals(TestData.kerryKing.getName(), artistNameByIndex);
    }

    @Test
    public void shouldReturnArtistNameAsUnknownOnIndexMoreThanListSize() {
        String artistNameByIndex = refactoredArtists.getArtistName(3);

        assertEquals("unknown", artistNameByIndex);
    }

    @Test
    public void shouldReturnArtistNameAsUnknownOnIndexLessThanZero() {
        String artistNameByIndex = refactoredArtists.getArtistName(-1);

        assertEquals("unknown", artistNameByIndex);
    }

    @Test
    public void shouldReturnArtistNameUnknownOnValidIndexingEmptyList() {
        RefactoredArtists refactoredEmptyArtists = new RefactoredArtists(Collections.EMPTY_LIST);

        String artistNameByIndex = refactoredEmptyArtists.getArtistName(0);

        assertEquals("unknown", artistNameByIndex);
    }
}
