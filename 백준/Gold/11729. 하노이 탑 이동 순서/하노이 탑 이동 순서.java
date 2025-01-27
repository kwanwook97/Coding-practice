import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 원판의 개수 입력
        sc.close();

        // 이동 횟수 출력 (2^n - 1)
        System.out.println((int) Math.pow(2, n) - 1);

        // 하노이 탑 이동 순서 출력
        hanoi(n, 1, 3, 2);

        // 결과 출력
        System.out.print(sb.toString());
    }

    // 하노이 탑 재귀 함수
    public static void hanoi(int n, int start, int end, int aux) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        // n-1개의 원판을 보조 장대로 이동
        hanoi(n - 1, start, aux, end);

        // 가장 큰 원판을 목표 장대로 이동
        sb.append(start).append(" ").append(end).append("\n");

        // n-1개의 원판을 보조 장대에서 목표 장대로 이동
        hanoi(n - 1, aux, end, start);
    }
}