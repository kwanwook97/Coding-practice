import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫번째줄 - 정수의 개수 담기.
        int n = Integer.parseInt(br.readLine());
        
        // 두번째줄 - 공백으로 구분된 값들을 배열에 담기.
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 배열에 담긴 값들중 최솟값과 최대값 구하기.
        int max = arr[0];
        int min = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
        
    }
}