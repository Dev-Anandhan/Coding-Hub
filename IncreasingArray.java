import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long moves = 0;

        long prev = sc.nextLong();

        for (int i = 1; i < n; i++) {
            long curr = sc.nextLong();
            if (curr < prev) {
                moves += (prev - curr);
            } else {
                prev = curr;
            }
        }

        System.out.println(moves);
        sc.close();
    }
}
