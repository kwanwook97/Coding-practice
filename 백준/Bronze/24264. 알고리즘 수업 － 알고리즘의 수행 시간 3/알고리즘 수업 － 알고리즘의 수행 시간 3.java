import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // 입력 크기 n

        // 이중for문
        // 2 = n^2
        System.out.println(n * n);  // 코드1 수행 횟수
        System.out.println(2);      // 다항식 최고차항 차수
    }
}
