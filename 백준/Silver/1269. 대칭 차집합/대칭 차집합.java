import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄: 집합 A와 B의 원소 개수
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 두 번째 줄: 집합 A의 원소들
        Set<Integer> A = new HashSet<>();
        for (int i = 0; i < n; i++) {
            A.add(scanner.nextInt());
        }

        // 세 번째 줄: 집합 B의 원소들
        Set<Integer> B = new HashSet<>();
        for (int i = 0; i < m; i++) {
            B.add(scanner.nextInt());
        }

        // 대칭 차집합 구하기: (A - B) ∪ (B - A)
        Set<Integer> symmetricDifference = new HashSet<>(A);
        symmetricDifference.addAll(B);  // (A ∪ B)
        Set<Integer> common = new HashSet<>(A);
        common.retainAll(B);  // (A ∩ B)
        symmetricDifference.removeAll(common);  // (A ∪ B) - (A ∩ B)

        // 대칭 차집합의 원소 개수 출력
        System.out.println(symmetricDifference.size());
        
        scanner.close();
    }
}
