import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        Stack<Integer> stack = new Stack<>();
        int current = 1;  // 번호는 1부터 시작
        
        // 대기열에서 번호를 처리
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            
            // 번호가 맞으면 바로 간식 줄 수 있음
            if (num == current) {
                current++;
                
                // 스택에 있는 번호가 바로 나올 수 있으면 꺼냄
                while (!stack.isEmpty() && stack.peek() == current) {
                    stack.pop();
                    current++;
                }
            } else {
                // 번호가 맞지 않으면 스택에 넣음
                stack.push(num);
            }
        }

        // 마지막까지 순서대로 처리되었는지 확인
        if (current == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
