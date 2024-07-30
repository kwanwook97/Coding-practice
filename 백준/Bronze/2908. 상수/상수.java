import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[2];
        
        arr[0] = st.nextToken();
        // 입력받은 문자를 마지막부터 이어붙여서 뒤집기.
        for(int i=arr[0].length()-1; i>=0; i--){
            sb.append(arr[0].charAt(i));
        }
        // 뒤집은 문자를 정수로 형변환.
        int ia = Integer.parseInt(sb.toString());
        
        sb.setLength(0);       // StringBuilder를 초기화.
        arr[1] = st.nextToken();
        for(int i=arr[1].length()-1; i>=0; i--){
            sb.append(arr[1].charAt(i));
        }
        
        int ib = Integer.parseInt(sb.toString());
        
        // 두 값 비교.
        if(ia > ib){
            System.out.println(ia);
        }else{
            System.out.println(ib);
        }
        
    }
}