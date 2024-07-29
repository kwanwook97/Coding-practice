import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        for(int i=0; i<n; i++){
        	
        	/* Char를 int로 변환하는 법
        	1. String.valueof를 사용해서 String으로 변환 후 parseInt사용.
        	2. char에서 문자'0'을 빼준다. (ASCII를 이용한 방법)        	 
        	 */        	
            sum += str.charAt(i) - '0';
        }        
        System.out.println(sum);
    }
}