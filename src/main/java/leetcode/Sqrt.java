package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/7.
 */
public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        return (int) Math.floor(mySqrt((double)x, ((double)x) / 2));
    }

    private double mySqrt(double x, double initGuess) {
        double currentGuess = 0.5 * (x / initGuess + initGuess);
        if (Math.abs(initGuess - currentGuess) <= 0.000000001) {
            return currentGuess;
        } else {
            return mySqrt(x, currentGuess);
        }
    }
}
