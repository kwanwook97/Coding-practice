import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N과 K 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // 큐에 1부터 N까지 숫자 넣기
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // K번째 사람을 제거하는 과정
        int cnt = 0;
        while (!q.isEmpty()) {
            cnt++;
            if (cnt == k) {
                sb.append(q.poll()).append(", ");
                cnt = 0; // K번째 사람을 제거한 후, 다시 1로 초기화
            } else {
                q.add(q.poll()); // K번째가 아니면 큐 뒤로 보내기
            }
        }
        
        // 마지막 ", " 제거하고 ">" 추가
        sb.setLength(sb.length() - 2);
        sb.append(">");

        // 결과 출력
        System.out.println(sb);
    }
}
