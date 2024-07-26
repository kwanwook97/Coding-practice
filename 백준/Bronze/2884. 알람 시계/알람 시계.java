import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        
        // 1. minutes가 45분 미만일 때 시간의 변경발생.
        if(minutes < 45){
            minutes = 60 + minutes - 45;
            // 3. hours(0~23시)가 0시일때는 23시.
            if(hours == 0){
                hours = 23; 
            // 4. hours 1~23시일때는 hours-1
            }else{
                hours = hours-1; 
            }
        // 2. minute가 45분 이상일 때는 minute의 변경만 발생.
        }else{
            minutes = minutes - 45;
        }
        System.out.println(hours + " " + minutes);
    }
}