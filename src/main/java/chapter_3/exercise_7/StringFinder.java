package chapter_3.exercise_7;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StringFinder {

    public static Optional<String> findLargestLowercaseString(Stream<String> stream) {
        return stream.max(Comparator.comparing(String::length));
    }
}
