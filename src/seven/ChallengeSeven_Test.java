package seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeSeven_Test {

    @Test
    public void testFind3rdPrime() {
        long expected = 5L;
        assertEquals(expected, ChallengeSeven.findNthPrime(3));
    }

    @Test
    public void testFind6thPrime() {
        long expected = 13L;
        assertEquals(expected, ChallengeSeven.findNthPrime(6));
    }
}
