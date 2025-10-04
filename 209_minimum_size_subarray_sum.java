class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right=0; right<nums.length; right++) {
            sum += nums[right]; // expand until condition is met

            // shrink from left while condition is still valid
            while (sum >= target) {
                minLen = Math.min(minLen, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}