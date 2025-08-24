class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = grid.length;
        int[] res = new int[2];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0)+1);
            }
        }

        for (int i=1; i<=(n*n); i++) {
            if(map.containsKey(i)) {
                continue;
            } else {
                res[1] = i;
                break; 
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > 1) {
                res[0] = entry.getKey();
            }
        }
        return res;
    }
}