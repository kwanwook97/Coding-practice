import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int result = 0;      // 상금
        
        // 3개의 값이 같은경우
        if(first == second && first == third){
            result = 10000 + first * 1000;
        // 3개의 값이 모두다른경우
        }else if(first != second && first != third && second != third ){
            // 세 수중 가장 큰 값을 찾는다.
            result = ((first > second ? first:second) > third ? (first > second ? first:second) : third);
            result *= 100;
        // 같은눈이 2개만 나오는경우1 - first와 second만 같은경우
        }else if(first == second && first != third){
            result = 1000 + first * 100;
        // 같은눈이 2개만 나오는경우2 - first와 third만 같은경우            
        }else if(first != second && first == third){
            result = 1000 + first * 100;
        // 같은눈이 2개만 나오는경우3 - second와 third만 같은경우
        }else{
            result = 1000 + second * 100;
        }
        System.out.println(result);
     }   
}