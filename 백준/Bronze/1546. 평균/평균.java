import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        // 첫째줄 : 값을 n번 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double m        ;    // 최대값.
        double sum =0.0;     // 세수의 합.
        double avg = 0.0;    // 평균.
        
        // 둘째줄 : 과목 n개 각각의 점수.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] arr = new double[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = Double.parseDouble(st.nextToken());    
            
        }
        
        // 최대값 구하기
        m = arr[0];        
        for(int i=1; i<arr.length; i++){
            if(m < arr[i]){
                m = arr[i];
            }
        }
        
        // 각 점수/M*100
        for(int i=0; i<arr.length; i++) {
            sum += (arr[i] / m * 100);
        }
        
        // 평균구하기
        avg = sum/arr.length;
        System.out.println(avg);

    }
}