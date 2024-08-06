import java.util.Scanner;

public class Main{
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        
        int count = 0;        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
        }
    
        // 1. 그룹단어를 체크할 함수를 생성한다.
        public static boolean check(){
            // 2. 26개의 단어를 체크할 길이 26의 boolean배열을 선언.
            boolean[] arr = new boolean[26];
            int prev = 0;       
            int now;
            
            // 3. 문자열을 입력받는다.    
            String str = sc.next();
            
            for(int i=0; i < str.length(); i++){
                now = str.charAt(i);   // i번째 문자를 ASCCI코드로 저장.(현재문자)
                                    
                // 앞선문자인'prev'와 현재문자'now'가 다르다면 => 중복문자여부 검사.  
                if(prev != now){
                    // 해당문자가 처음 나오는 경우 (false인 경우)
                    if(arr[now-'a'] == false){   
                        arr[now-'a'] = true;     // true로 바꿔준다.
                        prev = now;                // 다음 턴을 위해 prev에 현재문자를 저장한다.
                    }
                    
                    // 해당문자가 나온적이 있다면 => 그룹단어가 아니다.
                    else{ 
                        return false; // 함수 종료
                    }
                }else{ // 앞선문자인'prev'와 현재문자'now'가 같다면 => 연속된 문자.
                    continue;
                }    
            }
            return true;
        }
}
