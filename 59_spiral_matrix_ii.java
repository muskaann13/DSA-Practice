class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;

        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;

        while (startRow<=endRow && startCol<=endCol) {
            // top
            for (int j=startCol; j<=endCol; j++) {
                ans[startRow][j] = count++;
            }
            startRow++;

            // above we have already increased row by 1 so neeche hum agar startRow+1 toh skip hojayega ek row
            // right
            for (int i=startRow; i<=endRow; i++) {
                ans[i][endCol] = count++;
            }
            endCol--;

            // Only proceed if there is still a row to traverse
            if (startRow <= endRow) {
                // bottom
                for (int j=endCol; j>=startCol; j--) {
                    ans[endRow][j] = count++;
                }
                endRow--;
            }

            if (startCol <= endCol) {
                // left
                for (int i=endRow; i>=startRow; i--) {
                    ans[i][startCol] = count++;
                }
                startCol++;
            }
        }
        return ans;
    }
}