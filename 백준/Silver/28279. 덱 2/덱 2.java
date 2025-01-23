import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<Integer>();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            switch(arr[0]){
                case "1":
                    dq.offerFirst(Integer.parseInt(arr[1]));
                    break;
                case "2":
                    dq.offerLast(Integer.parseInt(arr[1]));
                    break;
                case "3":
                    if(!dq.isEmpty()){
                        sb.append(dq.pollFirst()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "4":
                    if(!dq.isEmpty()){
                        sb.append(dq.pollLast()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "5":
                    sb.append(dq.size()).append("\n");
                    break;
                case "6":
                    if(!dq.isEmpty()){
                        sb.append(0).append("\n");
                    }else{
                        sb.append(1).append("\n");
                    }
                    break;
                case "7":
                    if(!dq.isEmpty()){
                        sb.append(dq.peekFirst()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "8": 
                    if(!dq.isEmpty()){
                        sb.append(dq.peekLast()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        
        System.out.println(sb);
    }
}