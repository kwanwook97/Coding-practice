import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        // 배열 복사 후 정렬
        int[] arrClone = arr.clone();
        Arrays.sort(arrClone);
        
        // 좌표 압축을 위한 Map 생성
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int value : arrClone) {
            if (!map.containsKey(value)) {
                map.put(value, rank++);
            }
        }
        
        // 원본 배열에 대해 압축된 좌표 생성
        StringBuilder sb = new StringBuilder();
        for (int value : arr) {
            sb.append(map.get(value)).append(" ");
        }
        
        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}