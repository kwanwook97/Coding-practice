import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> deque = new LinkedList<Integer>();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push": 
                    deque.add(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    Integer num = deque.poll(); // Integer로 반환값을 받기
                    if (num != null) {  // 큐가 비어있지 않으면
                        sb.append(num).append("\n");    
                    } else {
                        sb.append(-1).append("\n");  // 큐가 비어있으면 -1
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    Integer front = deque.peek(); // 큐의 첫 번째 요소
                    if (front != null) {
                        sb.append(front).append("\n");    
                    } else {
                        sb.append(-1).append("\n");    
                    }
                    break;
                case "back":
                    Integer back = deque.peekLast(); // 큐의 마지막 요소
                    if (back != null) {
                        sb.append(back).append("\n");    
                    } else {
                        sb.append(-1).append("\n");    
                    }
                    break;
            }
        }
        
        System.out.println(sb);
    }
}
