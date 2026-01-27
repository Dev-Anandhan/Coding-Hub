import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLen++;
            } else {
                currLen = 1;
            }
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }

        System.out.println(maxLen);
        sc.close();
    }
}
