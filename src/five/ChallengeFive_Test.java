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
    public void findSmallestMultipleFor40() {
        int maxNum = 40;
        long product = ChallengeFive.findSmallestMultipleFor(maxNum);
        System.out.println("product = " + product);
        assertTrue(isNumbersEvenDivisible(product, maxNum));
    }

    @Test
    public void findSmallestMultipleForNumberLessThan40() {
        for (int i = 39; i > 0 ; i--) {
            long product = ChallengeFive.findSmallestMultipleFor(i);
            System.out.println("number = " + i + " product = " + product);
            assertTrue(isNumbersEvenDivisible(product, i));
        }
    }

    @Test
    public void calculatePrimesFor10() {
        ArrayList<Long> primes = ChallengeFive.calculatePrimes(10);
        assertTrue(primes.contains(2L));
        assertTrue(primes.contains(3L));
        assertTrue(primes.contains(5L));
        assertTrue(primes.contains(7L));
    }

    boolean isNumbersEvenDivisible(long product, int maxNum){
        boolean isEvenlyDivisible = true;

        for (int i = 1; i <= maxNum ; i++) {
            if (product%i != 0) {
                isEvenlyDivisible = false;
                break;
            }
        }
        return isEvenlyDivisible;
    }
}
