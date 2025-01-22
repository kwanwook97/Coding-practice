import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();  // 다음 라인으로 넘어가기 위해 개행문자 처리

        // 듣도 못한 사람 명단
        Set<String> notHeard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            notHeard.add(sc.nextLine());
        }

        // 보도 못한 사람 명단
        Set<String> notSeen = new HashSet<>();
        for (int i = 0; i < M; i++) {
            notSeen.add(sc.nextLine());
        }

        // 두 집합의 교집합 구하기
        notHeard.retainAll(notSeen);

        // 교집합을 리스트로 변환하고 정렬
        List<String> result = new ArrayList<>(notHeard);
        Collections.sort(result);

        // 결과 출력
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }

        sc.close();  // Scanner 닫기
    }
}
