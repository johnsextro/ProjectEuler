package five;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChallengeFive_Test {

    @Test
    public void findSmallestMultipleFor6() {

        long expected = 6L;
        assertEquals(expected, ChallengeFive.findSmallestMultipleFor(3));
    }

    @Test
    public void findSmallestMultipleFor10() {

        long expected = 2520L;
        assertEquals(expected, ChallengeFive.findSmallestMultipleFor(10));
    }

    @Test
    public void calculatePrimesFor10() {
        ArrayList<Long> primes = ChallengeFive.calculatePrimes(10);
        assertTrue(primes.contains(2L));
        assertTrue(primes.contains(3L));
        assertTrue(primes.contains(5L));
        assertTrue(primes.contains(7L));
    }

}
