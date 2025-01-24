import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 n 입력

        // 피보나치 수열 계산
        int[] fib = new int[n + 1]; // 피보나치 수열을 저장할 배열
        fib[0] = 0; // F_0 = 0
        if (n >= 1) {
            fib[1] = 1; // F_1 = 1
        }

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // F_n = F_{n-1} + F_{n-2}
        }

        System.out.println(fib[n]); // 결과 출력
    }
}