import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 1~n번까지의 바구니
        int n = Integer.parseInt(st.nextToken());
        // m번 공교체.
        int m = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[n];
        int temp;
        
        // 배열에 값넣기. (1~n)
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
            
        for(int a=0; a<m; a++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }
        
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]).append(" ");
        }       
        System.out.println(sb);
    }
}    