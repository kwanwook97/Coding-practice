// 1. 도화지의 넓이는 100x100 = 10,000
// 2. 색종이의 넓이는 10x10 = 100
// 3. 색종이를 여러장붙었을 때 중복되는 부분은 빼주어야 한다.

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        // 도화지 생성
        boolean[][] arr = new boolean[100][100];
        
        int n = sc.nextInt(); // 첫번째 줄은 도화지에 붙일 색종이의 수.
        int x = 0;  // 가로
        int y = 0;  // 세로
        StringTokenizer st;
        // 색종이의 수만큼 색종이 붙이기.            
        for(int i=0; i<n; i++){
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            for(int j=x; j<x+10; j++){ // 색종이의 길이는 10
                for(int k=y; k<y+10; k++){
                    arr[j][k] = true;  // 사용된 면적 체크하기.    
                }
            }
        }
        int area = 0; //tue로 체크되어있는 부분만 넓이 구하기
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]){
                    area++;   
                }
            }
        }
        System.out.println(area);  
        
    }
}