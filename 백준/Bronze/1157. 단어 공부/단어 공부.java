import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();  // 대/소문자를 구분하지 않기 때문에 대문자로 변환
        int[] alpha = new int[26];  // 알파벳은 총 26개
        char answer = '?';
        
        for(int i=0; i<str.length(); i++){
            // ASCII 에서 대문자의경우 -65를 해주면 index값을 구할 수 있다.
            alpha[str.charAt(i)-65]++;         
        }
        
        int max = 0;                   // 최대값        
        for(int i=0; i<alpha.length; i++){
            if(alpha[i] > max){
                max = alpha[i];
                answer = (char)(i+65);
            }else if(alpha[i] == max){
                answer = '?';
            }
        }        
        System.out.println(answer);
    }
}