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
        int nextInt() throws IOException {
            int c; do c = read(); while (c <= ' ');
            int res = 0;
            while (c > ' ') { res = res * 10 + c - '0'; c = read(); }
            return res;
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) sum += fs.nextInt();
        System.out.println(sum % 2 == 0 ? "YES" : "NO");
    }
}
