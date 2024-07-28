import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // n은 4의 배수.
        String result = "";
        
        for(int i=1; i<=n/4; i++){
            result += "long ";
        }
        
        System.out.println(result + "int");
    }
}