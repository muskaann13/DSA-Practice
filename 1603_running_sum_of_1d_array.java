class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int c = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
           nums[c++] = sum;
        }

        return nums;
    }
}