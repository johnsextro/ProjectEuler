package four;

import java.util.ArrayList;

public class Palindrome {

    public static long findLargestPalindrome(long num) {
        for (int i = 1; i < 99999; i++) {
            if (isPalindrome(num-i) && hasThreeDigitFactor(num-i)) {
                return num-i;
            }
        }
        return 0L;
    }

    public static boolean isPalindrome(long num) {
        String intStr = String.valueOf(num);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

    public static boolean hasThreeDigitFactor(long inputNumber) {

        ArrayList<Long> factors = new ArrayList<Long>();
        for (int i = 999; i > 100 ; i--) {
            if (inputNumber%i == 0){
                factors.add(new Long(i));
            }
        }

        if (factors.size() >= 2) {
            for (Long factor : factors) {
                if (factors.contains(inputNumber/factor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
