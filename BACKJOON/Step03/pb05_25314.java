import java.util.Scanner;

public class pb05_25314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        for (int i = 1; i <= N/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}