class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderPos = new HashMap<>();
        int currSum = 0;

        remainderPos.put(0, -1);

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            currSum += num;

            int remainder = currSum % k;

            if (remainderPos.containsKey(remainder)) {
                int prev_i = remainderPos.get(remainder);
                if (i - prev_i >= 2) {
                    return true;
                }
            } else {
                remainderPos.put(remainder, i);
            }            
        }
        return false;
    }
}