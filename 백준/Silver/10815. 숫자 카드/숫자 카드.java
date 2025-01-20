import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 상근이가 가진 숫자카드 개수
        int n = sc.nextInt();
        
        Set<Integer> cardSet = new HashSet<>();
        for(int i=0; i<n; i++){
            cardSet.add(sc.nextInt());                
        }
        
        // 확인할 숫자 개수
        n = sc.nextInt();
        List<Integer> list =new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        
        // 확인할 숫자들에 대해 1 또는 0 출력
        for(int num : list){
            if(cardSet.contains(num)){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }
        

        sc.close();
    }
}