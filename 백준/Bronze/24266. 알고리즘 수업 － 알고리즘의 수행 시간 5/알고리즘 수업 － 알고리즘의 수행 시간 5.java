import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();  // 입력 크기 n

        // 수행 횟수 계산: n^3
        long executions = n * n * n;

        // 출력
        System.out.println(executions);  // 코드1 수행 횟수
        System.out.println(3);           // 다항식 최고차항 차수
    }
}
