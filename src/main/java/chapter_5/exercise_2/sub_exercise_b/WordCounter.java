package chapter_5.exercise_2.sub_exercise_b;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordCounter {

    public static Map<String, Long> countEachWord(Stream<String> words) {
        return words.collect(groupingBy(word -> word, counting()));
    }
}
