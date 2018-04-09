package two;

public class challengeTwo {
    public static long fibonacci(long num) {
        long a = 1;
        long b = 1;
        long temp = 0;
        long sum = 0;

        while (a < num) {
            temp = a;
            a = a + b;
            b = temp;

            if (a < num && a%2 == 0)
                sum += a;
        }
        return sum;
    }
}
