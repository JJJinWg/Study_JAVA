import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pb07_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submitted = new boolean[31]; // 1~30번 학생까지 있으므로 크기 31로 선언
        for (int i = 0; i < 28; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            submitted[studentNum] = true; // 해당 번호 학생은 제출 완료!
        }
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) { // submitted[i] == false 인 경우
                System.out.println(i);
            }
        }
    }
}
