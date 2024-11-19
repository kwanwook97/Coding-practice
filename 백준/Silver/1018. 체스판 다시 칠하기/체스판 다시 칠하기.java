import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 행(row), M: 열(column) 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 체스판 입력받기
        char[][] board = new char[n][m];
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        
        int minChanges = Integer.MAX_VALUE; // 다시 칠해야 하는 칸의 최소값 초기화 => 비교를 위해 초기값은 Integer의 최대값.

        // 가능한 모든 8x8 체스판 시작점 탐색
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minChanges = Math.min(minChanges, countChanges(board, i, j));
            }
        }

        // 결과 출력
        System.out.println(minChanges);
    }

    // 특정 8x8 체스판에서 다시 칠해야 하는 칸 수 계산
    private static int countChanges(char[][] board, int startX, int startY) {
        int count1 = 0; // 왼쪽 위가 'W'로 시작하는 경우
        int count2 = 0; // 왼쪽 위가 'B'로 시작하는 경우

        // 두 가지 패턴
        char[][] patterns = {
            {'W', 'B'},
            {'B', 'W'}
        };

        // 8x8 체스판 탐색
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[startX + i][startY + j];
                if (current != patterns[(i + j) % 2][0]) count1++; // 'W' 시작 패턴
                if (current != patterns[(i + j) % 2][1]) count2++; // 'B' 시작 패턴
            }
        }

        // 두 패턴 중 최소값 반환
        return Math.min(count1, count2);
    }
}