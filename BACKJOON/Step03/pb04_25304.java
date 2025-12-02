import java.util.Scanner;

public class pb04_25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int T = 0;
        for (int i = 1; i <= N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            T = T + (a * b);
        }
        if (X == T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
