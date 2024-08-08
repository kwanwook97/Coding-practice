//완전수 : x == x를 제외한 x의 모든 약수들의 합
//완전수가 아니라면 'is NOT perfect.'출력
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     
     while(true){    
         int n = 0;
         n = sc.nextInt();
         if(n == -1) {
        	 break;
         }
         int sum = 0;         
         String str = "";
         StringBuilder sb = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
         for(int i=1; i<n; i++){ // i<n으로 자기자신은 제외
               if(n%i == 0){ // 약수라면, 더하기
                 sum += i;  
                 sb2.append(i).append(" + ");
               }
         }
         if(sum == n){  // 완전수라면
             sb.append(n).append(" = ").append(sb2);
             str = sb.toString();
             str = str.substring(0, str.length() - 3); // 뒤에 세글자 자르기.' + '
             System.out.println(str);
         }else {   // 완전수가 아니라면
        	 sb.append(n).append(" is NOT perfect.");
        	 System.out.println(sb);
        	 
         }         
     }
     
 }
}