// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.HashSet;

// public class pb08_3052 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         HashSet<Integer> set = new HashSet<>();
//         for (int i = 0; i < 10; i++) {
//             int A = Integer.parseInt(br.readLine());
//             set.add(A % 42);
//         }
//         System.out.println(set.size());
//     }
// }
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pb08_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] remainders = new boolean[42];
        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            remainders[A % 42] = true;
        }
        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (remainders[i]) { // 값이 true라면 (나온 적이 있는 나머지라면)
                count++;
            }
        }

        System.out.println(count);
    }
}
