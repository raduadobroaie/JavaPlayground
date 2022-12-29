package projectEuler;

import java.util.stream.IntStream;

public class MultiplesOf3And5 {

    public int findSumOfMultiples(int limit) {
        return IntStream.range(0, limit)
                .filter(MultiplesOf3And5::isMultipleOf3And5)
                .sum();
    }

    private static boolean isMultipleOf3And5(int element) {
        return element % 5 == 0 || element % 3 == 0;
    }
}
