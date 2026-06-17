import java.util.*;

class Solution {
    List<List<String>> ans = new ArrayList<>();
    boolean[] col, d1, d2;
    int[] pos;

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        d1 = new boolean[2 * n];
        d2 = new boolean[2 * n];
        pos = new int[n];
        solve(0, n);
        return ans;
    }

    void solve(int r, int n) {
        if (r == n) {
            ans.add(build(n));
            return;
        }

        for (int c = 0; c < n; c++) {
            int id1 = r + c, id2 = r - c + n - 1;

            if (!col[c] && !d1[id1] && !d2[id2]) {
                pos[r] = c;
                col[c] = d1[id1] = d2[id2] = true;

                solve(r + 1, n);

                col[c] = d1[id1] = d2[id2] = false;
            }
        }
    }

    List<String> build(int n) {
        List<String> board = new ArrayList<>();

        for (int r = 0; r < n; r++) {
            StringBuilder s = new StringBuilder();
            for (int c = 0; c < n; c++) {
                s.append(pos[r] == c ? 'Q' : '.');
            }
            board.add(s.toString());
        }

        return board;
    }
}