import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");                                                      
        StringBuilder sb = new StringBuilder();
        int num = 0;
                                               
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개 (총16개)  
        // 피스의 종류는 6개이므로 길이가 6인 배열생성.                                               
        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        for(int i=0; i<arr.length; i++){
            num = Integer.parseInt(st.nextToken());
            if(arr[i] != num){
                sb.append(arr[i]-num);
            }else{
                sb.append(0);
            }
            sb.append(" ");
        }
        System.out.println(sb);                                                                                             
    }
}