package four;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Palindrome_Test {
    @Test
    public void testIsPalindromeWithKnownPalindrome() {
        assertTrue(Palindrome.isPalindrome(101101L));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome(998998L));
    }

    @Test
    public void testFindLargePalindromeCaseA() {
        assertEquals(101101L, Palindrome.findLargestPalindrome(101110L));
        assertEquals(793397L, Palindrome.findLargestPalindrome(800000L));
    }
}
