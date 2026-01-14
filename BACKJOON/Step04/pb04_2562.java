// import java.util.Scanner;

// public class pb04_2562 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int max = 0;
//         int index = 0;

//         for (int i = 1; i <= 9; i++) {
//             int num = in.nextInt();

//             if (num > max) {
//                 max = num;
//                 index = i;
//             }
//         }
//         in.close();
//         System.out.println(max);
//         System.out.println(index);
//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pb04_2562 {
    public static void main(String[] args) throws IOException {
        // 1. BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        // 2. 9번의 입력을 한 줄씩 읽어오기
        for (int i = 1; i <= 9; i++) {
            // br.readLine()으로 읽은 문자열을 정수로 변환
            int num = Integer.parseInt(br.readLine());

            if (num > max) {
                max = num;
                index = i;
            }
        }

        // 3. 결과 출력
        System.out.println(max);
        System.out.println(index);
    }
}