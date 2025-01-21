import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 수 입력받기
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            
            Stack<Character> stack = new Stack<>();
            boolean isValid = true; // 초기 상태는 유효한 괄호 문자열로 설정
            
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j); // 문자열에서 문자 하나씩 꺼내기
                
                if (ch == '(') {
                    stack.push(ch); // 여는 괄호는 스택에 넣기
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isValid = false; // 스택이 비어있다면 유효하지 않음
                        break;
                    } else {
                        stack.pop(); // 닫는 괄호는 스택에서 꺼내기
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                sb.append("YES").append("\n"); // 모든 괄호가 짝이 맞으면 YES
            } else {
                sb.append("NO").append("\n"); // 그렇지 않으면 NO
            }
        }
        
        System.out.print(sb); // 결과 출력
    }
}
