import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n개의 숫자의 개수를 입력받음
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 오름차순 정렬
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}