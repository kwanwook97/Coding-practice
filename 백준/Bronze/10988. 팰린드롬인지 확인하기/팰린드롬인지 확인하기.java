// 단어를 뒤집어도 똑같은 단어면 1, 아니면 0을 출력.
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        
        if(str.equals(sb.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}