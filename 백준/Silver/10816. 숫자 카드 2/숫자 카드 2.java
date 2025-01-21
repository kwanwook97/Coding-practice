import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N: 상근이가 가진 카드의 개수
        int n = Integer.parseInt(br.readLine());
        
        // 숫자 카드의 내용 입력받기
        String[] cards = br.readLine().split(" ");
        
        // 카드 개수를 저장할 HashMap 생성
        HashMap<Integer, Integer> cardCount = new HashMap<>();
        
        // 상근이가 가진 카드의 개수 세기
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(cards[i]);
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }
        
        // M: 찾고자 하는 숫자의 개수
        int m = Integer.parseInt(br.readLine());
        
        // 찾고자 하는 숫자들
        String[] queries = br.readLine().split(" ");
        
        // 결과를 담을 StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // 각 숫자에 대해 상근이가 가지고 있는 카드 개수 출력
        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(queries[i]);
            sb.append(cardCount.getOrDefault(query, 0)).append(" ");
        }
        
        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
