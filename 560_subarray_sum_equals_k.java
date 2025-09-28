class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int currSum = 0;
        int count = 0;

        prefixSumCount.put(0, 1);

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            currSum += num;

            int targetSum = currSum - k;

            if (prefixSumCount.containsKey(targetSum)) {
                count += prefixSumCount.get(targetSum);
            }

            prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0)+1);
        }
        return count;
    }
}