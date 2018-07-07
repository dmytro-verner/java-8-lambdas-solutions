package chapter_3.advanced_exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapImplViaReduce {

    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
        return stream.reduce(new ArrayList<>(),
                (acc, e) -> {
                    List<O> newAcc = new ArrayList<>(acc);
                    newAcc.add(mapper.apply(e));
                    return newAcc;
                },
                (List<O> left, List<O> right) -> {
                    List<O> newCombiner = new ArrayList<>(left);
                    newCombiner.addAll(right);
                    return newCombiner;
                });
    }
}
