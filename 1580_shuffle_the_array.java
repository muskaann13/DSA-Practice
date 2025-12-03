class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int a = 0;
        int b = n; 

        for (int i=0; i<nums.length; i++) {
            if (i % 2 != 0) {
                res[i] = nums[b++];
            } else {
                res[i] = nums[a++];
            }
        }
        return res;
    }
}