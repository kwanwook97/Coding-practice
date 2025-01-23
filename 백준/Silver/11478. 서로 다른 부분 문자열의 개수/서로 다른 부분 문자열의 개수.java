import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String str = br.readLine();
        int n = str.length();
        String[] arr = str.split("");
        
        Set<String> set = new HashSet<String>();
        
        for (int i = 0; i < n; i++) {
            String good = "";  // 부분 문자열을 담을 변수
            for (int j = i; j < n; j++) {
                good += arr[j];  // good에 arr[j]를 추가
                set.add(good);    // 그때마다 set에 추가
            }
        }
        
        System.out.println(set.size());
    }
}