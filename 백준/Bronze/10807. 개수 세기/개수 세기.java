import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫번째 라인의 값을 len변수에 저장.
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        int search = 0;
        int count = 0;   // 찾으려는 숫자 count
        
        // 두번째 라인의 값을 공백으로 구분.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 두번째 라인의 값을 배열에 입력.
        for(int i=0; i<len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 세번째 라인 읽어오기.
        search = Integer.parseInt(br.readLine());
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                count++;
            }
        }
        System.out.println(count);
    }
}