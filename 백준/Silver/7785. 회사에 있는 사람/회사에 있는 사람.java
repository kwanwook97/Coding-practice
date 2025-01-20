import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n개의 출입 기록 수
        int n = sc.nextInt();
        
        // 현재 회사에 있는 사람들을 저장할 Set (중복을 방지)
        Set<String> peopleInOffice = new HashSet<>();
        
        // 출입 기록을 처리
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String action = sc.next();
            
            if (action.equals("enter")) {
                peopleInOffice.add(name);  // 입장 시 Set에 추가
            } else if (action.equals("leave")) {
                peopleInOffice.remove(name);  // 퇴장 시 Set에서 제거
            }
        }

        // Set을 사전 순 역순으로 정렬
        List<String> result = new ArrayList<>(peopleInOffice);
        Collections.sort(result, Collections.reverseOrder());  // 역순 정렬
        
        // 결과 출력
        for (String person : result) {
            System.out.println(person);
        }

        sc.close();
    }
}