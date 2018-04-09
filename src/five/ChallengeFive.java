package five;

public class ChallengeFive {
    public static long findSmallestMultipleFor(long maxNum) {
        long multiplier = 1L;

        while(true) {
            long possibleAnswer = maxNum * multiplier++;
            boolean evenlyDivisible = false;
            for (long num = maxNum; num > 1; num--) {
                if(possibleAnswer%num != 0){
                    evenlyDivisible = false;
                    break;
                } else {
                    evenlyDivisible = true;
                }
            }
            if (evenlyDivisible)
                return possibleAnswer;
        }
    }
}
