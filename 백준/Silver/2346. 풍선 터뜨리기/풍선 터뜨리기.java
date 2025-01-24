import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 풍선의 개수
        Deque<int[]> deque = new ArrayDeque<>(); // 풍선의 번호와 종이 값을 저장할 Deque

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int value = Integer.parseInt(st.nextToken());
            deque.addLast(new int[]{i, value}); // {풍선 번호, 종이 값}
        }

        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder

        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst(); // 현재 풍선
            int balloonNumber = current[0]; // 풍선 번호
            int move = current[1]; // 이동할 거리

            result.append(balloonNumber).append(" "); // 결과에 풍선 번호 추가

            if (deque.isEmpty()) break; // 모든 풍선을 터뜨렸으면 종료

            // 이동 방향에 따라 Deque를 조작
            if (move > 0) {
                // 오른쪽으로 이동 (양수)
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 왼쪽으로 이동 (음수)
                for (int i = move; i < 0; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(result.toString().trim()); // 결과 출력
    }
}