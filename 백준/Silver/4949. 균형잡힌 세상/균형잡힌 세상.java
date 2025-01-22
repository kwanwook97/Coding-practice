import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            
            // 입력이 "."이면 종료
            if (str.equals(".")) {
                break;
            }
            
            // 스택을 사용하여 괄호 짝 맞추기
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);  // 열린 괄호는 스택에 넣음
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty()) {
                        isBalanced = false;  // 스택이 비어있다면 짝이 맞지 않음
                        break;
                    }
                    
                    char top = stack.pop();
                    if (ch == ')' && top != '(') {
                        isBalanced = false;  // 짝이 맞지 않음
                        break;
                    } else if (ch == ']' && top != '[') {
                        isBalanced = false;  // 짝이 맞지 않음
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                isBalanced = false;  // 스택에 열린 괄호가 남아있다면 불균형
            }

            sb.append(isBalanced ? "yes" : "no").append("\n");
        }

        System.out.print(sb);
    }
}
