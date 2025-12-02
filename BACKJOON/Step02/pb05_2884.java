import java.util.Scanner;

public class pb05_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        in.close();
        if (M >= 45) {
            System.out.print(H + " ");
            System.out.println(M - 45);
        } else {
            if (H == 0) {
                System.out.print(23 + " ");
            } else {
                System.out.print((H - 1) + " ");
            }
            System.out.println(M + 15);
        }
    }
}

// import java.util.Scanner;

// public class pb05_2884 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int H = in.nextInt();
//         int M = in.nextInt();
//         in.close();
//         if (M > 45) {
//             System.out.println(M - 45); // ❌ 오류 1: H(시)를 출력하지 않아 틀린 답이 됨.
//         } else if (M <= 45) {
//             if (H == 0) {
//                 System.out.print(23); // ❌ 오류 2: 출력 시 H와 M 사이에 공백이 없음.
//             } else {
//                 System.out.print(H - 1); // ❌ 오류 2: 출력 시 H와 M 사이에 공백이 없음.
//             }
//             System.out.println((M + 60) - 45); // 45분 미만일 때 분(M) 계산은 올바름.
//         }
//     }
// }