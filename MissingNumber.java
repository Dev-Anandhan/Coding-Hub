import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // numbers should be from 1 to n
        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            xor ^= x;
        }

        System.out.println(xor);
        sc.close();
    }
}
