import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = str.length();

        Set<String> set = new HashSet<String>();

        // 부분 문자열 생성
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                set.add(str.substring(i, j)); // 부분 문자열을 set에 추가
            }
        }

        // 서로 다른 부분 문자열의 개수 출력
        System.out.println(set.size());
    }
}
