class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            pq.add(num);

            if (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.peek();
    }
}