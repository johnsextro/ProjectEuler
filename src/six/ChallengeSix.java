package six;

public class ChallengeSix {
    public static long calcSumOfSquares(int lastNum) {
        return ((lastNum * (lastNum+1) * ((2*lastNum) + 1))/6);
    }

    public static long calcSquareOfSums(double i) {
        return (long) (((i / 2) * (1 + i)) * ((i / 2) * (1 + i)));
    }

    public static long calcSumSquareDiff(int lastNum) {
        return Math.abs(calcSumOfSquares(lastNum) - calcSquareOfSums(lastNum));
    }
}
