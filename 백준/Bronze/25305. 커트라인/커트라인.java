import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 응시자 수
        int n = sc.nextInt();
        
        // 수상자 수 
        int k = sc.nextInt();
        
        Integer[] num = new Integer[n];
        
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        
        // 내림차순 정렬
        Arrays.sort(num, Collections.reverseOrder());
        
        // 응시자 중 작은 값 추출
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<k; i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        
        System.out.println(min);

        sc.close();
    }
}