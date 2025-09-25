class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int c = 0;

        int zeroCount = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (zeroCount > 1) {
                nums[c++] = 0;
            } else if (zeroCount == 1) {
                nums[c++] = (nums[i] == 0) ? product : 0;
            } else {
                nums[c++] = product / nums[i];
            }
        }

        return nums;
    }
}