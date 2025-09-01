class Solution {
    public int superPow(int a, int[] b) {
        int n = b.length-1;
        long p = 0;

        for(int num : b) {
            p += num*Math.pow(10, n--);
        }

        return helper(a, p) % 1337;
    }

    private int helper(int a, long p) {
        if (p == 1) {
            return a;
        }

        int halfPower = helper(a, p/2);
        int halfPowerSq = halfPower * halfPower;

        if (p % 2 != 0) {
            halfPowerSq *= a;
        }
        return halfPowerSq;
    }
}