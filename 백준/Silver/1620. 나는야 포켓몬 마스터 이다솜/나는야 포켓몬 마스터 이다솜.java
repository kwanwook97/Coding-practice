import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 포켓몬 개수 n, 질문 개수 m
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        // 포켓몬 정보를 저장할 map
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> reverseMap = new HashMap<>();
        
        // 포켓몬 이름 입력받기
        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            map.put(i, pokemon);
            reverseMap.put(pokemon, i); // 이름으로 번호 찾을 수 있도록 reverseMap을 만들어 놓기
        }
        
        StringBuilder sb = new StringBuilder();
        
        // 질문에 대한 답 처리
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (isNumeric(query)) { // 숫자인 경우
                int num = Integer.parseInt(query);
                sb.append(map.get(num)).append("\n");
            } else { // 문자열인 경우
                sb.append(reverseMap.get(query)).append("\n");
            }
        }
        
        System.out.print(sb);
    }
    
    // 숫자인지 확인하는 메서드
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
