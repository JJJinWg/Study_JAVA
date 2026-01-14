import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb05_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 첫 번째 토큰: N
        int M = Integer.parseInt(st.nextToken()); // 두 번째 토큰: M
        int[] baskets = new int[N];
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int index = i-1; index < j; index++) {
                baskets[index] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int value : baskets) {
            sb.append(value).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
