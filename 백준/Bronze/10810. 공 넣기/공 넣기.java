import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // N : 바구니는 1~N개존재하고 1~N번이 적힌 공이 존재.
        int n = Integer.parseInt(st.nextToken());
        // M : 공을 바구니에 M번 넣을예정.
        int m = Integer.parseInt(st.nextToken());
        
        // 1~N개의 바구니 생성.
        int arr[] = new int[n];
        
        // 바구니에 공넣기 M번 반복.
        for(int a=0; a<m; a++){      
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            // i ~ j바구니까지 k번공을 넣는다.
            for(int b=i-1; b<j; b++){
                arr[b] = k;    
            }            
        }
        
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i] + " ");
        }    
        bw.flush();
        bw.close();
        
    }
}