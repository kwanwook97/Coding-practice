import java.util.Scanner;

public class Main {
    static char[][] starMap; // 별과 공백을 저장할 2차원 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력
        starMap = new char[N][N]; // N×N 크기의 배열 초기화

        // 배열을 공백으로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                starMap[i][j] = ' ';
            }
        }

        // 재귀 함수 호출
        drawStar(0, 0, N);

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.println(new String(starMap[i]));
        }
    }

    // 재귀 함수: (x, y)부터 크기 N의 패턴을 그린다.
    static void drawStar(int x, int y, int N) {
        // 기본 패턴 (N = 3)
        if (N == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        starMap[x + i][y + j] = ' '; // 가운데는 공백
                    } else {
                        starMap[x + i][y + j] = '*'; // 나머지는 별
                    }
                }
            }
            return;
        }

        // N > 3인 경우
        int size = N / 3; // 다음 크기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    // 가운데는 공백으로 둠
                    continue;
                } else {
                    // 나머지 영역에 대해 재귀 호출
                    drawStar(x + i * size, y + j * size, size);
                }
            }
        }
    }
}