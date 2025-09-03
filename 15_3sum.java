class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
    
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = -nums[i];
            int j=i+1;
            int k=nums.length-1;

            while (j < k) {
                if (nums[j]+nums[k] == target) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    res.add(triplet);

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    
                    j++;
                    k--;
                } else if (nums[j]+nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
}