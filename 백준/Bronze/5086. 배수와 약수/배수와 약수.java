import java.util.Scanner;
import java.lang.StringBuilder;
// 1. factor : x가 y의 약수인경우
// 2. multiple : x가 y의 배수인경우
// 3. neither : x가 y의 약수도 배수도 아닌경우

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        
        while(true){
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            
            // 만약, x와 y값이 둘다 0이라면 반복문 종료.
            if(x == 0 && y == 0){
                break;
            }
            
            if(y%x == 0){                     // 1.x가 y의 약수인 경우
                sb.append("factor").append("\n");
            }else if(x%y == 0){               // 2. x가 y의 배수인 경우
                sb.append("multiple").append("\n");
            }else if(y%x != 0 && x%y != 0){   // 3. x가 y의 약수도 배수도 아닌경우
                sb.append("neither").append("\n");
            }
            
        }
        System.out.println(sb.toString());
    }
}