import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n개의 숫자의 개수를 입력받음
        int n = sc.nextInt();
        
        // 숫자들을 저장할 배열 선언
        int[] num = new int[n];
        
        // 숫자 입력받기
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        // 버블정렬
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }                
            }
        }
        
        // 정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }

        sc.close();
    }
}