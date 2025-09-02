class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        return helper(num, steps);
    }

    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        return (num%2 == 0) ? helper(num/2, steps+1) : helper(num-1, steps+1);
    }
}