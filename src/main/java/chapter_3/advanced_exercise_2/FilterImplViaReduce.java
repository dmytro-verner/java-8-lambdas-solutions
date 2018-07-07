package chapter_3.advanced_exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterImplViaReduce {

    public static <T> List<T> filter(Stream<T> stream, Predicate<T> predicate) {
        return stream.reduce(new ArrayList<>(),
                (acc, e) -> {
                    List<T> newAcc = new ArrayList<>(acc);
                    if(predicate.test(e))
                        newAcc.add(e);
                    return newAcc;
                },
                (List<T> left, List<T> right) -> {
                    List<T> newCombiner = new ArrayList<>(left);
                    newCombiner.addAll(right);
                    return newCombiner;
                });
    }
}
