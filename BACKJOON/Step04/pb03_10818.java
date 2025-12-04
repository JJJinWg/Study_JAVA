// Scanner 배열 사용 O
// import java.util.Scanner;
// import java.util.Arrays;

// public class pb03_10818 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int N = in.nextInt();
//         int[] arr = new int[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = in.nextInt();
//         }
//         in.close();
//         Arrays.sort(arr);
//         System.out.println(arr[0] + " " + arr[N-1]);
//     }
// }
// BufferedRedaer 배열 사용 X

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb03_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int index = 0;
        int[] arr = new int[N];
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
}
// // BufferedRedaer 배열 사용 X
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class pb03_10818 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         int max = -1000001;
//         int min = 1000001;

//         while (st.hasMoreElements()) {
//             int val = Integer.parseInt(st.nextToken());
//             if (val > max) {
//                 max = val;
//             }
//             if (val < min) {
//                 min = val;
//             }
//         }
//         System.out.println(min + " " + max);
//     }
// }