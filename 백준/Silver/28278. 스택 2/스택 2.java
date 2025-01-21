import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // n개 라인 개수 입력받기
        int n = Integer.parseInt(br.readLine());
        
        // 1 x : 정수x를 스택에 넣는다.
        // 2 : 맨위의 정수를 빼고 출력.
        // 3 : 스택에 들어있는 정수의 개수 출력.
        // 4 : 스택이 비어있으면 1, 아니면 0 출력.
        // 5 : 스택에 정수가 있다면 맨위의 정수 출력. 없다면, -1을 대신 출력
        
       // 스택생성
        Stack<Integer> stack = new Stack<Integer>(); 
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            String[] num = br.readLine().split(" ");  // 입력값을 공백 기준으로 나눔
            
            switch(num[0]){
                case "1": 
                    stack.push(Integer.parseInt(num[1]));  // 스택에 정수 넣기
                    break;
                case "2": 
                    if (!stack.isEmpty()) {  // 스택이 비어있지 않으면 pop
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");  // 스택이 비어있으면 -1 출력
                    }
                    break;
                case "3": 
                    sb.append(stack.size()).append("\n");  // 스택에 들어있는 정수의 개수 출력
                    break;
                case "4": 
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");  // 스택이 비어있으면 1 출력
                    } else {
                        sb.append(0).append("\n");  // 스택이 비어있지 않으면 0 출력
                    }
                    break;
                case "5": 
                    if (!stack.isEmpty()) {
                        sb.append(stack.peek()).append("\n");  // 스택의 최상위 값 출력
                    } else {
                        sb.append(-1).append("\n");  // 스택이 비어있으면 -1 출력
                    }
                    break;
            }
        }
        
        System.out.print(sb);  // 결과 출력
    }
}