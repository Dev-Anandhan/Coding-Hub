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
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        long x = fs.nextLong(), y = fs.nextLong();
        long d = Math.max(Math.abs(x), Math.abs(y));
        System.out.println((d + 1) / 2);
    }
}
