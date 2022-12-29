package codility;

import codility.SecondProblem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondProblemTest {

    @Test
    public void testSolution() {
        SecondProblem secondProblem = new SecondProblem();

        assertEquals(9918, secondProblem.solution(new int[]{30, 909, 3190, 99, 3990, 9009}));
    }

}