package codility;

import java.util.Arrays;

public class PracticeProblem {

    public int findSmallestIntegerNotInArray(int[] array) {
        int[] sortedArray = Arrays.stream(array).distinct().sorted().toArray();

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        int candidate=1;
        for (int wholeNumber : sortedArray) {
            if (wholeNumber <= 0) {
                continue;
            }

            if (candidate != wholeNumber) {
                return candidate;
            }

            candidate++;
        }

        return candidate;
    }
}
