package chapter_3.exercise_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCountTest {

    @Test
    public void shouldCountLowerCaseLetters() {
        String testString = "That's a String with 15 LOWERCASE LETTERs";

        int lowerCaseLettersCount = StringCount.countLowerCaseLetters(testString);

        assertEquals(15, lowerCaseLettersCount);
    }

    @Test
    public void shouldCountEmptyString() {
        String testString = "";

        int lowerCaseLettersCount = StringCount.countLowerCaseLetters(testString);

        assertEquals(0, lowerCaseLettersCount);
    }
}
