import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수 N 입력
        long factorial = 1; // 팩토리얼 결과를 저장할 변수 (0! = 1)

        // 팩토리얼 계산
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(factorial); // 결과 출력
    }
}