import java.util.Scanner;

public class pb03_8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = 0;
        for (int i = 1; i <= N; i++) {
            T += i;
        }
        System.out.println(T);
    }
}
