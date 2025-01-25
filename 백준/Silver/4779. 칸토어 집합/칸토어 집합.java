import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 여러 줄로 받기 위해 while 루프 사용
        while (sc.hasNextInt()) {
            int n = sc.nextInt(); // N 입력
            String result = cantorSet(n); // 칸토어 집합 생성
            System.out.println(result); // 결과 출력
        }

        sc.close();
    }

    // 칸토어 집합을 생성하는 재귀 함수
    public static String cantorSet(int n) {
        // 초기 문자열 생성: '-'로 구성된 길이 3^N의 문자열
        String initialString = repeat("-", (int) Math.pow(3, n));
        return cantorHelper(initialString, n, 0);
    }

    // 재귀적으로 칸토어 집합을 생성하는 도우미 함수
    private static String cantorHelper(String currentString, int n, int depth) {
        // 종료 조건: 분할 단계가 n에 도달하면 현재 문자열 반환
        if (depth == n) {
            return currentString;
        }

        // 문자열을 3등분하여 가운데 부분을 공백으로 치환
        int length = currentString.length();
        int partLength = length / 3;
        String left = currentString.substring(0, partLength);
        String middle = repeat(" ", partLength);
        String right = currentString.substring(2 * partLength);

        // 재귀 호출: 왼쪽과 오른쪽 부분에 대해 반복
        return cantorHelper(left, n, depth + 1) + middle + cantorHelper(right, n, depth + 1);
    }

    private static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}