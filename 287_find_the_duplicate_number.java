class Solution {
    public int findDuplicate(int[] nums) {
        // Slow-Fast/Cycle Detection
        int slow = nums[0];
        int fast = nums[0];

        // Cycle detection
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find entry point of cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}