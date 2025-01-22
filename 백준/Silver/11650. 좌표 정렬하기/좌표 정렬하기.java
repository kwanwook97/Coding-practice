import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];  // 배열 크기를 미리 정의해야 합니다.
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            
            arr[i][0] = Integer.parseInt(line[0]);
            arr[i][1] = Integer.parseInt(line[1]);
        }
        
        // 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int result = Integer.compare(a[0], b[0]);  // 첫 번째 열을 기준으로 정렬
                if (result == 0) {  // 두 값이 같은 경우 두 번째 열 값 비교
                    result = Integer.compare(a[1], b[1]);
                }
                return result;
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        
        System.out.println(sb);
    }
}
