import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전의 종류 수
        int K = sc.nextInt(); // 목표 금액

        int[] coins = new int[N]; // 동전의 가치를 저장할 배열
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int count = 0; // 사용한 동전의 개수

        // 가장 큰 가치의 동전부터 사용
        for (int i = N - 1; i >= 0; i--) {
            if (K >= coins[i]) {
                count += K / coins[i]; // 현재 동전으로 만들 수 있는 최대 개수
                K %= coins[i]; // 남은 금액
            }
        }

        System.out.println(count); // 결과 출력
    }
}