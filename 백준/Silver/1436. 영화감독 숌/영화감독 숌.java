import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 N번째 수를 계산
        int cnt = sc.nextInt();
        System.out.println(findNum(cnt));
    }

    private static int findNum(int cnt) {
        int count = 0; // "666"이 포함된 숫자가 몇번째인지 체크
        int num = 666; // 시작 숫자

        while (true) {
            // 숫자에 "666"이 포함되어 있는지 확인
            if (String.valueOf(num).contains("666")) {
                count++; // 포함되면 카운트 증가
            }

            // N번째 "666"을 찾으면 반환
            if (count == cnt) {
                return num;
            }

            // 숫자 증가
            num++;
        }
    }
}