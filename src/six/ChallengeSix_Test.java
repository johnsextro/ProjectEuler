package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeSix_Test {

    @Test
    public void testSumofSquaresFor3() {
        long expected = 14;
        assertEquals(expected, ChallengeSix.calcSumOfSquares(3));
    }

    @Test
    public void testSumofSquaresFor1to10() {
        long expected = 385;
        assertEquals(expected, ChallengeSix.calcSumOfSquares(10));
    }

    @Test
    public void testCalcSquareOfSumsFor1to10() {
        long expected = 3025L;
        assertEquals(expected, ChallengeSix.calcSquareOfSums(10));
    }

    @Test
    public void testCalcSquareOfSumsFor3() {
        long expected = 36L;
        assertEquals(expected, ChallengeSix.calcSquareOfSums(3));
    }

    @Test
    public void testCalcSumSquareDiff() {
        long expected = 3025L - 385L;
        assertEquals(expected,
                ChallengeSix.calcSumSquareDiff(10));
    }

    @Test
    public void testCalcSumSquareDifffor3() {
        long expected = 22L;
        assertEquals(expected,
                ChallengeSix.calcSumSquareDiff(3));
    }
}
