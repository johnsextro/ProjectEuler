package seven;

import java.util.ArrayList;

public class ChallengeSeven {
    public static long findNthPrime(long nthPrime) {
        if (nthPrime < 2) return 2;
        if (nthPrime == 2) return 3;
        if (nthPrime == 3) return 5;
        nthPrime -= 2;
        int[] primes = new int[(int) nthPrime];
        primes[0] = 5;
        int candidate, count, step = 2;
        for(candidate = 7, count = 1; count < nthPrime; step = 6-step, candidate += step) {
            if (isPrime(candidate,primes,count)) {
                primes[count] = candidate;
                ++count;
            }
        }
        return primes[(int) (nthPrime-1)];
    }

    private static boolean isPrime(int n, int[] primes, int primeCount) {
        int m = (int) Math.sqrt(n) + 1;
        for (int i = 0, p; i < primeCount && (p = primes[i]) < m; ++i) {
            if (n % p == 0) {
                return false;
            }
        }
        return true;
    }
}
