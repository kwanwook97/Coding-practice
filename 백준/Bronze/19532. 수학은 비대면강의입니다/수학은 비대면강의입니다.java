import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        // 행렬식 계산
        int div = a * e - b * d;

        if (div != 0) {
            // 크래머 공식으로 x, y 계산
            int x = (c * e - b * f) / div;
            int y = (a * f - c * d) / div;

            System.out.println(x + " " + y);
        }

        scanner.close();
    }
}