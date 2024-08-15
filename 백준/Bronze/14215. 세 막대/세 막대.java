import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = 0;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            tmp = a;
            a = c;
            c = tmp;
        }

        while (true) {
            int sum = a + b + c;   // 삼각형 둘레 구하기
            if (b + c > a) {       // 삼각형 공식 : 제일긴변은 나머지 두변의 합보다 작아야한다.
                System.out.println(sum);
                break;
            } else {
                a--;
            }
        }
        sc.close();
    }
}