class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        for (int n : nums) {
            if (n != min && n != max) return n;
        }
        return -1;
    }
}