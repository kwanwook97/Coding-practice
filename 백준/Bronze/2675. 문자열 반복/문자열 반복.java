import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();        
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            // 각 문자의 반복횟수 입력받기
            int m = Integer.parseInt(st.nextToken());
            // 문자열 입력받기
            String str = st.nextToken();            
        
            // 문자열의 각 문자를 n번씩 반복하여 출력.
            for(int j=0; j<str.length(); j++){
                for(int k=0; k<m; k++){
                    sb.append(str.charAt(j));    
                }                  
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}    