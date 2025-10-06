class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            set.add(num);
            if (set.size() > 3) {
                // removes element from the starting index
                set.pollFirst();
            }
        }
        return (set.size() == 3) ? set.first() : set.last();
    }
}