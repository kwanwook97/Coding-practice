import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // MenOfPassion알고리즘은 입력받은 배열의 중간index 값을 반환하기 때문에
        // 수행횟수는 항상 1번이다.
        // O(1)상수 시간 : 단순 계산 
        // 1 = x^0
        System.out.println(1);  // 수행 횟수는 항상 1
        System.out.println(0);  // 최고차항 차수는 항상 0
    }
}