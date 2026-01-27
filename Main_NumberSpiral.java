import java.io.*;

public class Main {
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in = System.in;

        int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            long res = 0;
            int c;
            do { c = read(); } while (c <= ' ');
            boolean neg = false;
            if (c == '-') { neg = true; c = read(); }
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return neg ? -res : res;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            long y = fs.nextLong();
            long x = fs.nextLong();

            long z = Math.max(x, y);
            long base = (z - 1) * (z - 1);
            long ans;

            if ((z & 1) == 0) {
                ans = (y == z) ? base + x : base + 2 * z - y;
            } else {
                ans = (x == z) ? base + y : base + 2 * z - x;
            }

            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
