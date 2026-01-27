import java.io.*;

class FastScanner {
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
    int nextInt() throws IOException { return (int) nextLong(); }
}

public class TwoSets {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long sum = (long)n * (n + 1) / 2;
        if ((sum & 1) == 1) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        boolean[] take = new boolean[n + 1];
        long need = sum / 2;
        for (int i = n; i >= 1; i--) {
            if (need >= i) {
                take[i] = true;
                need -= i;
            }
        }
        StringBuilder a = new StringBuilder(), b = new StringBuilder();
        int ca = 0, cb = 0;
        for (int i = 1; i <= n; i++) {
            if (take[i]) { a.append(i).append(' '); ca++; }
            else { b.append(i).append(' '); cb++; }
        }
        System.out.println(ca);
        System.out.println(a);
        System.out.println(cb);
        System.out.println(b);
    }
}
