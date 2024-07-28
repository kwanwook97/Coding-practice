import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
/* 
    BufferedWrite보다 StringBuilder의 속도가 더 빠르기때문에, StringBuilder를 사용하여 구현.
    StringBuilder는 문자열의 변경이 발생할 때 새로운 객체를 참조하는 것이 아니라, 값을 변경하는 것이다.
    따라서, 속도가 빠르고 부하가 적다.
*/

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 첫째줄 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 두번째줄에 입력받은 값들을 배열과 변수에 담기.
        int len = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[len];
        
        st = new StringTokenizer(br.readLine(), " "); 
        for(int i=0; i<len; i++){
            arr[i] = Integer.parseInt(st.nextToken());  
                
        }
        
        // 주어진 값들중 x보다 작은 값 출력하기.
        for(int i=0; i<arr.length; i++){
            if(arr[i] < x){     // x값보다 작다면, StringBuilder를 이용하여 문자열 변경.
                sb.append(arr[i]).append(' ');
            }       
        }
        
        System.out.println(sb);
    }
}