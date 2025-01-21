import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // n개 라인 개수 입력받기
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);                
            }
        }
        
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        
        System.out.print(sum);

    }
}