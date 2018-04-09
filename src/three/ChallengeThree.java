package three;

import java.util.ArrayList;
import java.util.Comparator;

public class ChallengeThree {
    public static long findLargestPrime(long inputNumber) {

        ArrayList<Long> primes = new ArrayList<Long>();
        while (inputNumber%2==0)
        {
            primes.add(2L);
            inputNumber /= 2;
        }

        for (long i = 3; i <= Math.sqrt(inputNumber); i+= 2)
        {
            // While i divides n, print i and divide n
            while (inputNumber%i == 0)
            {
                primes.add(i);
                inputNumber /= i;
            }
        }

        if (inputNumber > 2)
            primes.add(inputNumber);

        primes.sort(new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                return a > b ? -1 :(a < b ? 1 : 0);
            }
        });

        return primes.get(0);
    }
}
