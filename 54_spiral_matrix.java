class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int col=startCol; col<=endCol; col++) {
                list.add(matrix[startRow][col]);
            }

            // right
            for (int row=startRow+1; row<=endRow; row++) {
                list.add(matrix[row][endCol]);
            }

            // bottom
            for (int col=endCol-1; col>=startCol; col--) {
                if (startRow == endRow) break;
                list.add(matrix[endRow][col]);
            }

            // left
            for (int row=endRow-1; row>startRow; row--) {
                if (startCol == endCol) break;
                list.add(matrix[row][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return list;
    }
}