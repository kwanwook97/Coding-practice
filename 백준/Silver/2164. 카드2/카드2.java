import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        // 1부터 N까지의 숫자를 큐에 넣음
        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size() > 1) {  // 큐에 카드가 1개 남을 때까지 반복
            q.poll();            // 제일 위 카드 버리기
            int first = q.poll(); // 제일 위 카드를 제일 아래로 옮기기
            q.add(first);
        }
        
        System.out.println(q.peek());  // 마지막으로 남은 카드 출력
    }
}
