import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 문자열 입력받기
        String input = br.readLine();
        
        char[] num = input.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(num);
        
        // 내림차순으로 뒤집기
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        System.out.print(sb.reverse().toString());

    }
}