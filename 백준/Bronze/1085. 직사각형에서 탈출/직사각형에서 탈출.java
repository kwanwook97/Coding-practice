import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // (x,y)는 한수의 위치
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        // (w,h)는 오른쪽위 꼭짓점
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        // (w-x, x)는 가로 탈출길이
        int width = Math.min(x, w-x);
        // (h-y, y)는 세로 탈출길이
        int height = Math.min(y, h-y);
        // 가로 탈출길이 vs 세로 탈출길이 비교
        System.out.println(Math.min(width, height));
    }    
}
