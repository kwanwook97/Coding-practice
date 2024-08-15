import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int[][] arr = new int[n][2]; 
        
        // 1. 2차원배열에 좌표값들 저장하기.
        for(int i=0; i<arr.length; i++){
            arr[i][0] = Integer.parseInt(sc.next());
            arr[i][1] = Integer.parseInt(sc.next());
        }
        
        int xMax = arr[0][0];    // x좌표 최대값
        int xMin = arr[0][0];    // x좌표 최소값        
        int yMax = arr[0][1];    // y좌표 최대값
        int yMin = arr[0][1];    // y좌표 최소값
        
        // 2. 좌표 값 구하기         
        for(int i=0; i<arr.length; i++){
            if(xMax < arr[i][0]){
                xMax = arr[i][0];
            }
            if(xMin > arr[i][0]){
                xMin = arr[i][0];
            }
            if(yMax < arr[i][1]){
                yMax = arr[i][1];
            }
            if(yMin > arr[i][1]){
                yMin = arr[i][1];
            } 
        }
        
        System.out.println((xMax-xMin) * (yMax-yMin));
    }    
}
