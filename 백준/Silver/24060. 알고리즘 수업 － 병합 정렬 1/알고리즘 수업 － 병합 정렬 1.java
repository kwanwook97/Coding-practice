import java.io.*;
import java.util.*;

/* 병합정렬
    장점: 대량 데이터 정렬에 적합.
    단점: 추가 메모리공간 필요.
    1. 배열의 크기가 1이될 때까지 반으로 나눔.
    2. 나눠진 배열들을 병합하면서 정렬.
*/

public class Main {
    static int[] tmp; // 병합 정렬을 위한 임시 배열
    static int count = 0; // 저장 횟수 카운트
    static int result = -1; // K번째 저장된 값 (기본값은 -1)
    static int K; // 찾고자 하는 저장 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열의 크기
        K = Integer.parseInt(st.nextToken()); // 저장 횟수

        int[] A = new int[N]; // 배열 A
        tmp = new int[N]; // 임시 배열 초기화

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(A, 0, N - 1); // 병합 정렬 수행

        System.out.println(result); // 결과 출력
    }

    // 병합 정렬
    static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; // 중간 지점 계산
            mergeSort(A, p, q); // 전반부 정렬
            mergeSort(A, q + 1, r); // 후반부 정렬
            merge(A, p, q, r); // 병합
        }
    }

    // 병합
    static void merge(int[] A, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        // 두 부분 배열을 비교하며 병합
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
            count++; // 저장 횟수 증가
            if (count == K) { // K번째 저장된 값 찾기
                result = tmp[t - 1];
            }
        }

        // 왼쪽 부분 배열이 남은 경우
        while (i <= q) {
            tmp[t++] = A[i++];
            count++; // 저장 횟수 증가
            if (count == K) { // K번째 저장된 값 찾기
                result = tmp[t - 1];
            }
        }

        // 오른쪽 부분 배열이 남은 경우
        while (j <= r) {
            tmp[t++] = A[j++];
            count++; // 저장 횟수 증가
            if (count == K) { // K번째 저장된 값 찾기
                result = tmp[t - 1];
            }
        }

        // 임시 배열의 값을 원본 배열에 복사
        i = p;
        t = 0;
        while (i <= r) {
            A[i++] = tmp[t++];
        }
    }
}