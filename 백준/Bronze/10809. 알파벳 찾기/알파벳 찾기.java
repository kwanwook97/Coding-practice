import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                
        StringBuilder sb = new StringBuilder();
        
        // 알파벳은 총 26개
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        
        // ASCCI코드의 규칙을 이용.
        // 알파벳 - a = 알파벳의 순번.(0부터시작한다.)
        String s = br.readLine();
        int len = s.length();
        
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }    
        }
        
        // forEach문을 사용하여 출력.
        for(int result : arr){
            sb.append(result).append(" ");    
        }
        System.out.println(sb);        
    }
}