import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qnt = sc.nextInt(); // 주문받은 설탕 kg
        System.out.println(minBags(qnt)); // 최소 봉지 수 출력

        sc.close();
    }

    public static int minBags(int qnt) {
        int result = 0;

        // 최대한 5kg 봉지로 나누기
        while (qnt >= 0) {
            if (qnt % 5 == 0) {
                result += qnt / 5; // 5kg 봉지로 나눈 결과 추가
                return result; // 최소 봉지 개수 반환
            }
            qnt -= 3; // 5kg로 나누어 떨어지지 않으면 3kg 봉지 하나 사용
            result++;
        }

        // 정확히 나눌 수 없는 경우
        return -1;
    }
}