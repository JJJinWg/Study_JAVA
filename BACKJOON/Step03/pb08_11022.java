import java.io.*;
import java.util.StringTokenizer;

public class pb08_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            String Output = "Case #" + i + ": " + A  + " + " + B + " = " + sum + "\n";
            bw.write(Output);
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
