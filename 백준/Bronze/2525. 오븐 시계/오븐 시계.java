import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int reserve = sc.nextInt();
        
        // 1. 예약시간에서 시간과 분을 추출.
        int resHour = reserve / 60;
        int resMin = reserve % 60;

        // 2. 현재시간 + 예약시간
        hour += resHour;
        min += resMin;
        
        // 3. 분이 60분을 넘어가는 경우 min-60
        if(60 <= min){
            min -= 60;
            hour += 1;
        }
        
        // 4. 시간이 24시를 넘어가는 경우 hour-24
        if(24 <= hour){
            hour -= 24;     
        }
        
        // 5. 오븐이 종료되는 시간과 분 출력.
        System.out.println(hour + " " + min);         
    }
}