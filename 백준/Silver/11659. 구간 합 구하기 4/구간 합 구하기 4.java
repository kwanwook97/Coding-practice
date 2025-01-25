import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 크기
        int m = sc.nextInt(); // 구간 합을 계산할 횟수

        int[] arr = new int[n]; // 배열 선언
        int[] prefixSum = new int[n + 1]; // 누적 합 배열 (0-based)

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            prefixSum[i + 1] = prefixSum[i] + arr[i]; // 누적 합 계산
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int firstIdx = sc.nextInt(); // 시작 인덱스 (1-based)
            int lastIdx = sc.nextInt(); // 끝 인덱스 (1-based)

            // 구간 합 계산: prefixSum[lastIdx] - prefixSum[firstIdx - 1]
            int sum = prefixSum[lastIdx] - prefixSum[firstIdx - 1];
            sb.append(sum).append("\n");
        }

        System.out.print(sb); // 결과 출력
    }
}