import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // n개 라인 개수 입력받기
        int n = Integer.parseInt(br.readLine());
        
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i]= Integer.parseInt(br.readLine());
        }
        
        // 오름차순 정렬
        Arrays.sort(num);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(num[i]).append("\n");
        }
        System.out.print(sb);

    }
}