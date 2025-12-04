import java.util.Scanner;

public class pb11_10951 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A + B);
        }
        in.close();
    }
}
