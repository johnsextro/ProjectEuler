package two;

import org.junit.Test;

import static org.junit.Assert.*;

public class challengeTwoTest {

    @Test
    public void testFibonacciMaxVal10() {

        long expected = 10;
        assertEquals(expected, challengeTwo.fibonacci(10));
    }

    @Test
    public void testFibonacciMaxVal100() {

        long expected = 44;
        assertEquals(expected, challengeTwo.fibonacci(100));
    }
}