import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        // Stream을 사용하여 바이트 값을 문자열로 변환후 그 값을 담는 Buffered객체 생성. 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        int result = 0;
        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(result + "\n");        // \n을 통해 직접 개행을 해주어야 한다.
            
        }
        bw.flush();
        bw.close();
    }
}
