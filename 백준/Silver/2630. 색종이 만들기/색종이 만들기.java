import java.util.Scanner;

public class Main {
    static int white = 0; // 하얀색 색종이 개수
    static int blue = 0;  // 파란색 색종이 개수
    static int[][] paper; // 종이 정보

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 종이의 크기
        paper = new int[N][N]; // 종이 배열 초기화

        // 종이 정보 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        // 분할 정복 시작
        divide(0, 0, N);

        // 결과 출력
        System.out.println(white);
        System.out.println(blue);
    }
    
    // 분할정복
    static void divide(int x, int y, int size){
        // 현재 종이가 모두 같은 색인지 체크.
        if(isSameColor(x, y, size)){
            if(paper[x][y] == 0){
                white++;
            }else{
                blue++;
            }
            return;
        }
        
        // 종이를 4등분하여 재귀 호출
        int half = size / 2;
        divide(x, y, half); // 왼쪽 위
        divide(x, y + half, half); // 오른쪽 위
        divide(x + half, y, half); // 왼쪽 아래
        divide(x + half, y + half, half); // 오른쪽 아래
    }
    
    // 현재 종이가 모두 같은 색인지 확인하는 함수
    static boolean isSameColor(int x, int y, int size) {
        int color = paper[x][y]; // 첫 번째 칸의 색

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) {
                    return false; // 다른 색이 있으면 false
                }
            }
        }
        return true; // 모두 같은 색이면 true
    }
        
        
}