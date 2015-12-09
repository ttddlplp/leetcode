package leetcode;

public class Pow {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return pow(x, n);
        } else {
            return 1.0 / pow(x, -n);
        }
    }

    private double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double result = pow(x, n / 2);
        if (n % 2 == 0) {
            return result * result;
        } else {
            return result * result * x;
        }
    }
}
