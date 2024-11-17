import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 테스트 케이스 개수 입력받기
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            // 두 점 숫자 입력받기
            int num1 = sc.nextInt(); // 첫 번째 점 숫자
            int num2 = sc.nextInt(); // 두 번째 점 숫자

            // 두 숫자의 좌표값 찾기
            int[] coord1 = findCoord(num1);
            int[] coord2 = findCoord(num2);

            // 두 좌표의 x, y를 각각 더해준다.
            int newX = coord1[0] + coord2[0];
            int newY = coord1[1] + coord2[1];

            // 새로운 좌표의 점 숫자 계산
            int result = findNum(newX, newY);

            // 결과 출력
            System.out.println(result);
        }

        sc.close();
    }

    // 숫자로 좌표 값 찾기
    // 숫자 num이 몇 번째 대각선에 위치하는지 확인하고, 
    // 대각선 시작점과의 차이를 계산해 좌표값을 반환
    static int[] findCoord(int num) {
        int diagonal = 1;

        // 해당 숫자가 속한 대각선 찾기
        // 대각선에서 가장 큰 숫자는 n(n+1)/2
        // 입력된 숫자가 이 범위를 넘지 않을 때까지 diagonal 값을 증가시킴
        while (num > (diagonal * (diagonal + 1)) / 2) {
            diagonal++;
        }

        // 대각선의 시작 숫자
        // 대각선에서 가장 작은 숫자는 n(n-1)/2 + 1
        int startNum = (diagonal * (diagonal - 1)) / 2 + 1;

        // 대각선의 몇 번째 위치인지 계산
        // 입력된 숫자 num이 대각선 시작 숫자에서 몇 번째에 위치하는지 확인
        int offset = num - startNum;

        // 좌표 계산
        // x = 대각선의 시작 위치 + offset
        // y = 대각선의 마지막 위치 - offset
        return new int[]{offset + 1, diagonal - offset};
    }

    // 좌표를 점 숫자로 변환
    // 좌표 (x, y)를 입력받아 대각선 번호를 계산한 후
    // 해당 대각선의 시작 숫자에서 x축 위치를 더해 점 숫자를 반환
    static int findNum(int x, int y) {
        int diagonal = x + y - 1; // 몇 번째 대각선인가 계산
        int startNum = (diagonal * (diagonal - 1)) / 2 + 1; // 대각선의 첫 번째 숫자
        return startNum + (x - 1); // 대각선의 첫 번째 숫자 + x-1 만큼 더하기
    }
}
