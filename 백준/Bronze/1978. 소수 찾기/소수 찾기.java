import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        boolean[] arr = new boolean[n];
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = true;                  // 초기값은 true로 잡아놓는다.
            m = Integer.parseInt(sc.next()); // 소수인지 확인하기 위한 정수
            // 소수는 1과 자기자신만이 약수여야 한다. (1은 제외)
            if(m != 1){
                for(int j=2; j<m; j++){  // 1은 당연히 약수일 것이므로 2부터 시작.                  
                    if(m % j == 0){      // 자기자신도 당연히 약수일 것이므로 자기자신 전까지만 반복.
                        arr[i] = false;
                    }       
                }            
            }else{
                arr[i] = false;
            }            
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == true){
                count++;
            }
        }
        System.out.println(count);
    }
}