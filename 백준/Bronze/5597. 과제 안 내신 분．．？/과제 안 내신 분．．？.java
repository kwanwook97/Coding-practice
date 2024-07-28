import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 학생수는 30명
        int[] arr = new int[30];
        
        // 28명 과제제출받기. (배열은 0부터시작.)
        for(int i=0; i<28; i++){
            arr[Integer.parseInt(br.readLine())-1] = 1;
        }
        
        // 배열0~30에서 값이 없는 경우 출력.
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 1){
                sb.append(i+1).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}