package chapter_3.exercise_7;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringFinderTest {

    @Test
    public void shouldReturnOptionOnEmptyListOfStrings() {
        assertFalse(StringFinder.findLargestLowercaseString(Stream.empty()).isPresent());
    }

    @Test
    public void shouldReturnEmptyStringOnListWithOnlyEmptyStringElement() {
        assertEquals("", StringFinder.findLargestLowercaseString(Stream.of("")).get());
    }

    @Test
    public void shouldReturnStringWithMostLowercaseLetters() {
        assertEquals("Create", StringFinder.findLargestLowercaseString(Stream.of("Create", "uPdate", "DELETE")).get());
    }
}
