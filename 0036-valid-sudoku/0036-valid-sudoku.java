class Solution {
    public boolean isValidSudoku(char[][] board) {
        // seen rows[i][num] = true if digit num+1 is already in row i
        boolean[][] seenRows = new boolean[9][9];
        boolean[][] seenCols = new boolean[9][9];
        boolean[][] seenBoxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int num = c - '1';              // 0 to 8
                int boxIndex = (i / 3) * 3 + j / 3;

                if (seenRows[i][num] || seenCols[j][num] || seenBoxes[boxIndex][num]) {
                    return false;
                }

                seenRows[i][num] = true;
                seenCols[j][num] = true;
                seenBoxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}