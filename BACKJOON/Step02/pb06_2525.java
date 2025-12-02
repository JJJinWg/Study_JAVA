import java.util.Scanner;

public class pb06_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        in.close();
        int totalMinutes = B + C;
        int finalA = A + (totalMinutes / 60);
        int finalB = totalMinutes % 60;
        finalA = finalA % 24;
        System.out.println(finalA + " " + finalB);
    }
}


// import java.util.Scanner;

// public class pb06_2525 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int A = in.nextInt();
//         int B = in.nextInt();
//         int C = in.nextInt();
//         in.close();
//         if (B + C >= 60) {
//             int total = (B + C) / 60;
//             if (A + total >= 24) {
//                 System.out.print(0 + total + " ");
//                 if ((B + C) % 60 == 0) {
//                     System.out.println(0);
//                 } else if ((B + C) % 60 != 0) {
//                     System.out.println((B + C) % 60);
//                 }
//             } else {
//                 System.out.print(A + total + " ");
//                 System.out.println((B + C) % 60);
//             }
//         } else if (B + C < 60) {
//             System.out.print(A + " ");
//             System.out.println(B + C);
//         }
//     }
// }
