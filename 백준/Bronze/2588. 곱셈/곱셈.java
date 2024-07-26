import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        // 1. 세자리수 자연수 2개를 변수 a와b에 각각 입력받는다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 2. 변수a x (변수b의 각 자리수)
        int c = a * (b%10);
        int d = a * (b%100/10);
        int e = a * (b/100);
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a * b);
    }
}