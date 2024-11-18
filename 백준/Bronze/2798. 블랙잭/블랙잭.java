import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫째 줄 카드개수 N(3 ≤ N ≤ 100)
		int cardCnt = sc.nextInt();
		// 첫째 줄 제한숫자 M(10 ≤ M ≤ 300,000)
		int maxNum = sc.nextInt();
		
		// 입력받은 카드를 담을 배열
		int[] arr = new int[cardCnt];
		
		// 둘째 줄 카드숫자 (100,000을 넘지않는 양의정수)
		for(int i=0; i<cardCnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean swapped; // 요소가 교환되었는지 확인하기 위한 변수
		
		// 내림차순 정렬 (버블소트 사용)
		for (int i = 0; i < cardCnt - 1; i++) {
		    swapped = false;

		    for (int j = 0; j < cardCnt - 1 - i; j++) {
		        if (arr[j] < arr[j + 1]) { 
		            int temp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = temp;
		            swapped = true;
		        }
		    }

		    if (!swapped) break; // 이미 정렬된 상태라면 반복문 종료
		}
		
		
		int result = 0; // Max값에 가장 가까운 합

        // 3장의 카드를 고르는 모든 조합 탐색
        for (int i = 0; i < cardCnt - 2; i++) {
            for (int j = i + 1; j < cardCnt - 1; j++) {
                for (int k = j + 1; k < cardCnt; k++) {
                    int sum = arr[i] + arr[j] + arr[k]; // 3장의 카드 합

                    // Max값을 넘지 않으면서 최대값 갱신
                    if (sum <= maxNum && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        // 결과 출력
        System.out.println(result);

        sc.close();
	}

}
