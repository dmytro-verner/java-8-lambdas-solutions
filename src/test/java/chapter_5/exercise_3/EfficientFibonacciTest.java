package chapter_5.exercise_3;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class EfficientFibonacciTest {

    private EfficientFibonacci efficientFibonacci = new EfficientFibonacci();

    private static Object[] positiveFibonacciNumbers() {
        return new Object[] {
                new Object[] {1, 1},
                new Object[] {2, 1},
                new Object[] {5, 5},
                new Object[] {5, 5},
                new Object[] {13, 233}
        };
    }

    @Test
    @Parameters(method = "positiveFibonacciNumbers")
    public void shouldCalculatePositiveNumber(int ithNumber, int expectedFibonacciNumber) {
        long calculatedFibonacciNumber = efficientFibonacci.calculate(ithNumber);
        assertEquals(expectedFibonacciNumber, calculatedFibonacciNumber);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsIAEForCalculatingNegativeNumber() {
        efficientFibonacci.calculate(-1);
    }

    @Test
    public void shouldCachePreviousCalculation() {
        long calculatedFibonacciNumber = efficientFibonacci.calculate(5);
        Map<Integer, Long> cachedFibonacciNumbers = efficientFibonacci.getCachedFibonacciNumbers();

        assertEquals(calculatedFibonacciNumber, cachedFibonacciNumbers.get(5).longValue());
    }

    @Test
    public void shouldCachePreviousIntermediateCalculation() {
        long calculatedFibonacciNumber = efficientFibonacci.calculate(5);
        Map<Integer, Long> cachedFibonacciNumbers = efficientFibonacci.getCachedFibonacciNumbers();

        assertEquals(calculatedFibonacciNumber, cachedFibonacciNumbers.get(5).longValue());
        assertEquals(3, cachedFibonacciNumbers.get(4).longValue());
        assertEquals(2, cachedFibonacciNumbers.get(3).longValue());
        assertEquals(1, cachedFibonacciNumbers.get(2).longValue());
        assertEquals(1, cachedFibonacciNumbers.get(1).longValue());
    }
}
