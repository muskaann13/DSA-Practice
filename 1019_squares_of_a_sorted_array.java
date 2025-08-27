class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int c = 0;

        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]*nums[i]);
        }

        while(!pq.isEmpty()) {
            nums[c++] = pq.peek();
            pq.remove();
        }
        return nums;
    }
}