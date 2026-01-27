import java.io.*;

public class Main {
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        int read() throws IOException {
            if (ptr >= len) {
                len = System.in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c; do c = read(); while (c <= ' ');
            long res = 0;
            while (c > ' ') { res = res * 10 + c - '0'; c = read(); }
            return res;
        }
        int nextInt() throws IOException { return (int) nextLong(); }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int q = fs.nextInt();
        StringBuilder out = new StringBuilder();
        while (q-- > 0) {
            long k = fs.nextLong();
            long len = 1, cnt = 9, start = 1;
            while (k > len * cnt) {
                k -= len * cnt;
                len++;
                cnt *= 10;
                start *= 10;
            }
            long num = start + (k - 1) / len;
            int idx = (int)((k - 1) % len);
            out.append(Long.toString(num).charAt(idx)).append('\n');
        }
        System.out.print(out);
    }
}
