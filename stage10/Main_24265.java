package stage10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_24265 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // MenOfPassion는 이중 for문
            // 외부 for문이 i가 1부터 n-1까지 진행하고 -> n - 1
            // 내부 for문이 i + 1부터 n까지 진행
            // 1 -> 0
            // 2 -> 1 1
            // 3 -> 2 1
            // 4 -> 3 2 1
            // 5 -> 4 3 2 1
            // (n-1)n / 2

            long n = Long.parseLong(br.readLine());

            System.out.println(((n - 1) * n) / 2L);
            System.out.println(2);

        } catch(Exception e) {

        }
    }
}
