import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 세 각의 합이 180이 아닌 경우에는 Error
        if( a+b+c != 180) System.out.println("Error");
        // 세 각의 크기가 모두 60이면, Equilateral
        else if( a == 60 && b == 60 && c == 60) System.out.println("Equilateral");
        // 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
        else if( a == b || b == c || c == a ) System.out.println("Isosceles");
        // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
        else System.out.println("Scalene");
    }
}





