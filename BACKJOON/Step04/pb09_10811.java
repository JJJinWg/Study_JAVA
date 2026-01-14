import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb09_10811 { // 클래스 이름은 Main으로!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] baskets = new int[N + 1];

        // 초기화: 1번 바구니엔 1번 공...
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        // M번 뒤집기 작업 수행
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            // 핵심: 양 끝을 잡고 좁혀오며 Swap
            while (left < right) {
                int temp = baskets[left];
                baskets[left] = baskets[right];
                baskets[right] = temp;

                left++;  // 왼쪽 포인터는 오른쪽으로
                right--; // [수정] 오른쪽 포인터는 왼쪽으로!
            }
        }

        // [수정] 모든 작업이 끝난 후 한 번만 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}