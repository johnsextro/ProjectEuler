package three;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class challengeThree_Test {

    @Test
    public void testFindLargestPrimeForTen(){

        long expected = 5;
        assertEquals(expected, ChallengeThree.findLargestPrime(10));
    }

    @Test
    public void testFindLargestPrimeForSeventeen(){

        long expected = 17;
        assertEquals(expected, ChallengeThree.findLargestPrime(17));
    }
}
