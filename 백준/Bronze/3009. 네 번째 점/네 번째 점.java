import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] xArr = new int[3]; // x 좌표를 저장할 배열
        int[] yArr = new int[3]; // y 좌표를 저장할 배열

        // 세 점 입력 받아 배열에 저장
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }

        int x = 0;
        int y = 0;

        // x의 네 번째 좌표 구하기
        if (xArr[0] == xArr[1]) {
            x = xArr[2];
        } else if (xArr[0] == xArr[2]) {
            x = xArr[1];
        } else {
            x = xArr[0];
        }

        // y의 네 번째 좌표 구하기
        if (yArr[0] == yArr[1]) {
            y = yArr[2];
        } else if (yArr[0] == yArr[2]) {
            y = yArr[1];
        } else {
            y = yArr[0];
        }

        System.out.println(x + " " + y);
    }
}