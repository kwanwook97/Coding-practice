import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        boolean status;
        
        // 랜덤 값 10개 입력.
        int[] arr = new int[10];
        
        for(int i=0; i<arr.length; i++){
            // 입력받은 값에서 42로 나눈 나머지 값을 넣어준다.
            arr[i] = Integer.parseInt(br.readLine()) % 42;   
        }
        
        for(int i=0; i<arr.length; i++){
            status = false; // 값을 false로 세팅.
            // 배열의 값들 비교.
            // 값이 같은게 있다면 상태를 false로 변경.
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    status = true;
                    break;
                }
            }
            if(status == false){
                count++;    
            }
            
        }
        System.out.println(count);
    }
}    