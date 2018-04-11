package seven;

import java.util.ArrayList;

public class ChallengeSeven {
    public static long findNthPrime(long nthPrime) {
        long i = 1;
        ArrayList<Long> primes = new ArrayList<Long>();

        do {
            if (isPrime(i))
                primes.add(i);
            i++;
        } while (primes.size() < nthPrime);

        return primes.get((int) (nthPrime-1));
    }

    private static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;
        int m = (int)Math.sqrt(n) + 1;

        for (long i = 2; i < m; ++i)
            if (n % i == 0)
                return false;

        return true;
    }
}
