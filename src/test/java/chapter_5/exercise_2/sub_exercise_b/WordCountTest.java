package chapter_5.exercise_2.sub_exercise_b;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.stream.Stream;

public class WordCountTest {

    @Test
    public void shouldReturnMapOfEachWordToCount() {
        Map<String, Long> wordToCountMap = WordCounter.countEachWord(Stream.of("Nice", "Bad", "Good", "Nice"));

        Assert.assertEquals(3, wordToCountMap.size());
        Assert.assertEquals(2, wordToCountMap.get("Nice").intValue());
        Assert.assertEquals(1, wordToCountMap.get("Bad").intValue());
        Assert.assertEquals(1, wordToCountMap.get("Good").intValue());
        Assert.assertNull(wordToCountMap.get("Nothing"));
    }

    @Test
    public void shouldReturnEmptyMapOnEmptyStream() {
        Map<String, Long> wordToCountMap = WordCounter.countEachWord(Stream.empty());
        Assert.assertTrue(wordToCountMap.isEmpty());
    }
}
