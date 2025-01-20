import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 중복 개수 계산 변수
        int cnt = 0;
        
        // n개의 주어진 문자열
        int n = sc.nextInt();
        // m개의 검사해야 하는 문자열
        int m = sc.nextInt();
        sc.nextLine();  // 개행문자 제거
        
        Set<String> arr = new HashSet<>();
        
        // n개의 문자열 입력받기
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());  // 문자열 입력 받기
        }

        // m개의 문자열 검사
        for (int i = 0; i < m; i++) {
            if (arr.contains(sc.nextLine())) {  // 이미 존재하는 문자열이면
                cnt++;
            }
        }
        
        // 포함된 수 출력
        System.out.println(cnt);

        sc.close();
    }
}