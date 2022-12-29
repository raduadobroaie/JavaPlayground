package lendscape.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PracticeProblemTest {

    @Test
    void findSmallestIntegerTest() {
        PracticeProblem problem = new PracticeProblem();
        int[] testArray = new int[] {1, 3, 6, 4, 1, 2};

        assertEquals(5, problem.findSmallestIntegerNotInArray(testArray));
    }
}