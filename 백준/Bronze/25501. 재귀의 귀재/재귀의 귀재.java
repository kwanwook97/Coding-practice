import java.util.Scanner;

public class Main {
    static int count = 0; // recursion 함수 호출 횟수를 저장할 변수

    public static int recursion(String s, int l, int r) {
        count++; // recursion 함수 호출 횟수 증가
        if (l >= r) return 1; // 팰린드롬인 경우
        else if (s.charAt(l) != s.charAt(r)) return 0; // 팰린드롬이 아닌 경우
        else return recursion(s, l + 1, r - 1); // 다음 문자 비교
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1); // recursion 함수 호출
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 개수 입력

        for (int i = 0; i < T; i++) {
            String S = sc.next(); // 문자열 입력
            count = 0; // 호출 횟수 초기화
            int result = isPalindrome(S); // 팰린드롬 여부 확인
            System.out.println(result + " " + count); // 결과 출력
        }
    }
}