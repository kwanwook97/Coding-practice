import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int len = 0;
        String[] arr = new String[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = br.readLine();
            len = arr[i].length()-1;
            sb.append(arr[i].charAt(0)).append(arr[i].charAt(len)).append("\n");
        }
        
        System.out.println(sb);
    }
}