import java.util.Scanner;

public class pb07_2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        in.close();
        if (A == B && B == C) {
            System.out.println(10000 + A * 1000);
        } else if (A == B || B == C || A == C) {
            int sameeye = 0;
            if (A == B) {
                sameeye = A;
            } else if (B == C) {
                sameeye = B;
            } else {
                sameeye = A;
            }
            System.out.println(1000 + sameeye * 100);
        } else {
            int maxeye = Math.max(A, Math.max(B, C));
            System.out.println(maxeye * 100);
        }
    }
}
