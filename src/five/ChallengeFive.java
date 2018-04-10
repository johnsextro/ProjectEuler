package five;

import java.util.ArrayList;

public class ChallengeFive {
    public static long findSmallestMultipleFor(long maxNum) {
        long finalProduct = 1;
        ArrayList<Long> primes = calculatePrimes(maxNum);

        for (Long prime : primes) {
            Long product = prime;
            do {
                if (product * prime < maxNum) {
                    product = product * prime;
                } else {
                    break;
                }
            } while (product < maxNum);

            finalProduct = finalProduct * product;
        }
        return finalProduct;
    }

    static ArrayList<Long> calculatePrimes(long inputNumber) {

        ArrayList<Long> primes = new ArrayList<Long>();

        for (int n = 1; n <= inputNumber; n++) {
            if(isPrime(n))
                primes.add(new Long(n));
        }

        return primes;
    }

    static boolean isPrime(long n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (long i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
