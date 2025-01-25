import java.util.Scanner;

public class Main {
    static int N, M;                // N: 최대 숫자, M: 수열의 길이
    static boolean[] visited;       // 숫자가 사용되었는지 확인하기 위한 배열
    static int[] sequence;          // 현재 선택된 숫자를 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();           // N 입력 받기
        M = sc.nextInt();           // M 입력 받기
        visited = new boolean[N + 1]; // 숫자 방문 여부를 확인하는 배열 (1~N 사용)
        sequence = new int[M];      // 수열을 저장하는 배열 (길이 M)

        backtrack(0);               // 백트래킹 시작, depth = 0
    }

    static void backtrack(int depth) {
        // 종료 조건: 길이가 M인 수열이 완성되었을 때
        if (depth == M) {
            for (int num : sequence) {
                System.out.print(num + " "); // 완성된 수열 출력
            }
            System.out.println();           // 줄바꿈
            return;                         // 탐색 종료
        }

        // 1부터 N까지의 숫자를 확인하며 수열을 생성
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {              // 숫자가 아직 사용되지 않았다면
                visited[i] = true;          // 현재 숫자 사용
                sequence[depth] = i;        // 현재 숫자를 수열에 추가
                backtrack(depth + 1);       // 다음 위치(depth)로 이동
                visited[i] = false;         // 탐색 후 복원 (백트래킹)
            }
        }
    }
}
