import java.util.Scanner;

public class Main {
    static int count1 = 0; // 재귀 호출 실행 횟수 (코드1)
    static int count2 = 0; // 동적 프로그래밍 실행 횟수 (코드2)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n 입력

        // 재귀 호출로 피보나치 수 계산
        fib(n);

        // 동적 프로그래밍으로 피보나치 수 계산
        fibonacci(n);

        // 결과 출력
        System.out.println(count1 + " " + count2);
    }

    // 재귀 호출 피보나치 함수
    static int fib(int n) {
        if (n == 1 || n == 2) {
            count1++; // 코드1 실행 횟수 증가
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // 동적 프로그래밍 피보나치 함수
    static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            count2++; // 코드2 실행 횟수 증가
        }

        return f[n];
    }
}