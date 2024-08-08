import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 약수를 구할 수.
        int n = Integer.parseInt(sc.next());
        
        // n의 약수중 k번째로 작은 수 구하기.
        int k = Integer.parseInt(sc.next());
        
        int count = 0;
        int result = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i == 0){           // n의 약수중에
              if(k == ++count){     // 몇번째로 작은 약수인가?
                  result = i;
              }  
            }
        }
        System.out.println(result);
    }    
}