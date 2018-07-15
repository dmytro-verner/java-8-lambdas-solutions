package chapter_5.exercise_3;

import java.util.HashMap;
import java.util.Map;

public class EfficientFibonacci {

    private Map<Integer, Long> cachedFibonacciNumbers;

    public EfficientFibonacci() {
        cachedFibonacciNumbers = new HashMap<>();

        cachedFibonacciNumbers.put(0, 0L);
        cachedFibonacciNumbers.put(1, 1L);
    }

    public long calculate(int i) {
        if(i < 0) {
            throw new IllegalArgumentException("Fibonacci number series index can't be non-positive but was " + i);
        }
        return cachedFibonacciNumbers.computeIfAbsent(i, ith -> calculate(ith - 1) + calculate(ith - 2));
    }

    public Map<Integer, Long> getCachedFibonacciNumbers() {
        return new HashMap<>(cachedFibonacciNumbers);
    }
}
