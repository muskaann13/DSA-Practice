class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        int[] sr = new int[heights.length];
        int[] sl = new int[heights.length];

        int n = heights.length;

        // Next Smaller Right
        for (int i=heights.length-1; i>=0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                sr[i] = n;
            } else {
                sr[i] = s.peek();
            }
            s.push(i);
        }

        s.clear();

        // Next Smaller Left
        for (int i=0; i<heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                sl[i] = -1;
            } else {
                sl[i] = s.peek();
            }
            s.push(i);
        }

        // Curr Area
        for (int i=0; i<heights.length; i++) {
            int width = sr[i] - sl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}