class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++) {
            int num = nums[i];
            for(int j=i+1; j<nums.length-2; j++) {
                long sum = (long) (num + nums[j]);
                Map<Long,Integer> map = new HashMap<>();
                for(int k=j+1; k<nums.length; k++) {
                    long complement = (long) target - sum - nums[k];
                    if (map.containsKey(complement)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add((int) complement);
                        list.add(nums[k]);
                        set.add(list);
                    }
                    map.put((long)nums[k], k);
                }
            }
        }
        return new ArrayList<>(set);
    }
}