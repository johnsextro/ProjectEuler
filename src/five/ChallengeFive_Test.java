package five;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
