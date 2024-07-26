import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
            // 연도가 400의 배수이면 윤년
        if(year%400 == 0){
            System.out.println("1");    
        }else if(year%4 == 0 && year%100 != 0){  
            // 연도가 4의 배수이면서 100의 배수가 아니면 윤년
            System.out.println("1");    
        }else{  
            // 그 외는 윤년이 아니다.
            System.out.println("0");    
        }
    }
}