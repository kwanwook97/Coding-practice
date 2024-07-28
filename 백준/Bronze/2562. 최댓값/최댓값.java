import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = arr[0];
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        // 첫째줄 : 최대값 구하기.
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
         // 둘째줄 : 최대값이 몇번째인지 구하기.
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
        
    }
}