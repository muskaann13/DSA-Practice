class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=nums2.length-1; i>=0; i--) {
            // Step 1 : while loop
            // pop all smaller or equal element from stack
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }

            // Step 2 : put nextGreater in HashMap
            if (s.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], s.peek());
            }

            // Step 3 : push current element to stack
            s.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}