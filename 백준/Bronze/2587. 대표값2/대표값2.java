import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5개의 자연수를 입력받음
        int[] num = new int[5];
        int sum = 0;
        int avg = 0;
        int center = 0;
        
        for(int i=0; i<5; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        
        // 평균값 구하기
        avg = sum/5;
        
        // 오름차순 정렬
        Arrays.sort(num);
        
        // 중앙값 구하기
        center = num[2];
        
        System.out.println(avg);
        System.out.println(center);

        sc.close();
    }
}