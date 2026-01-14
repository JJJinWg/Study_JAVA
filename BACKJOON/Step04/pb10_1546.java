import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb10_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 과목 수
        double[] scores = new double[N];

        double max = 0;
        double sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }
        System.out.println(sum * 100 / max / N);
    }
}
