import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 회원 수 입력
        Member[] members = new Member[N]; // 회원 정보를 저장할 배열

        // 회원 정보 입력
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name, i); // 나이, 이름, 가입 순서 저장
        }

        // 정렬: 나이순, 나이가 같으면 가입 순서순
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return Integer.compare(m1.order, m2.order); // 나이가 같으면 가입 순서로 정렬
                }
                return Integer.compare(m1.age, m2.age); // 나이순으로 정렬
            }
        });

        // 정렬된 결과 출력
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }

    // 회원 정보를 저장할 클래스
    static class Member {
        int age;
        String name;
        int order; // 가입 순서

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}