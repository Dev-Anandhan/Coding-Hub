class Solution {
    int count = 0;
    boolean[] col, d1, d2;

    public int totalNQueens(int n) {
        col = new boolean[n];
        d1 = new boolean[2 * n];
        d2 = new boolean[2 * n];
        solve(0, n);
        return count;
    }

    private void solve(int row, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int j = 0; j < n; j++) {
            int a = row + j;
            int b = row - j + n - 1;

            if (!col[j] && !d1[a] && !d2[b]) {
                col[j] = d1[a] = d2[b] = true;
                solve(row + 1, n);
                col[j] = d1[a] = d2[b] = false;
            }
        }
    }
}