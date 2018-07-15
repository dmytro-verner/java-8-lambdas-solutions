package chapter_5.exercise_2.sub_exercise_c;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class GroupingBy<T, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>>{

    private Function<? super T, ? extends K> classifier;

    private static Set<Characteristics> characteristics = new HashSet<>();

    static {
        characteristics.add(Characteristics.IDENTITY_FINISH);
    }

    public GroupingBy(Function<? super T, ? extends K> classifier) {
        this.classifier = classifier;
    }

    @Override
    public Supplier<Map<K, List<T>>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<K, List<T>>, T> accumulator() {
        return (acc, element) -> {
            K key = classifier.apply(element);
            List<T> elements = acc.computeIfAbsent(key, k -> new ArrayList<>());
            elements.add(element);
        };
    }

    @Override
    public BinaryOperator<Map<K, List<T>>> combiner() {
        return (leftPart, rightPart) -> {
            leftPart.forEach((key, value) -> rightPart.merge(key, value, (leftValue, rightValue) -> {
                rightValue.addAll(leftValue);
                return rightValue;
            }));
            return rightPart;
        };
    }

    @Override
    public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
        return kListMap -> kListMap;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return new HashSet<>(characteristics);
    }
}
