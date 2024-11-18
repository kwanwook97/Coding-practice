import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 자연수 N 입력받기
		System.out.println(construct(n));
		sc.close();
	}

	public static int construct(int n) {
		for (int i = 1; i <= n; i++) {
			int sum = i + digitSum(i); // 분해합 계산
			if (sum == n) {
				return i; // 가장 작은 생성자 반환
			}
		}
		return 0; // 생성자가 없는 경우 0 반환
	}

	// 각 자리수의 합을 구하는 메서드
	private static int digitSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10; // 마지막 자리수 추가
			num /= 10;       // 자리수를 하나 줄임
		}
		return sum;
	}

}