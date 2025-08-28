class Solution {
    public double myPow(double x, int n) {
        long N = n; // use long to avoid overflow for Integer.MIN_VALUE

        // handle negative power upfront
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return helper(x, N);
    }

    private double helper(double x, long n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        double halfPower = helper(x, n / 2);
        double halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) { // n is odd
            halfPowerSq *= x;
        }

        return halfPowerSq;
    }
}