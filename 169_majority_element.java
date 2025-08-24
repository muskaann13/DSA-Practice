class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int n = nums.length/2;

        for(int i=0; i<nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            int val = entry.getValue();
            if(val > n) {
                return entry.getKey();
            }
        }
        return -1;
    }
}