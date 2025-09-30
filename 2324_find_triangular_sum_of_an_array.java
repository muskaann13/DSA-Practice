class Solution {
    public int triangularSum(int[] nums) {
        int ans = helper(nums, nums.length);

        return ans;
    }

    public int helper (int[] nums, int n) {
        if (n == 1) {
            return nums[0];
        }

        int[] newNums = new int[n-1];
        
        for (int i=0; i<n-1; i++) {
            newNums[i] = (nums[i] + nums[i+1]) % 10;
        }

        return helper(newNums, n-1);
    }
}