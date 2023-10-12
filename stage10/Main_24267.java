package stage10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_24267 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // MenOfPassion는 삼중 for문
            // 외곽 n - 2
            // 내부 i + 1 ~ n - 1
            // 중심 j + 1 ~ n
            // 야매 수학...
            // 기본적으로 빅O만 생각하면 n-2 * n-1 * n 분모에 n이 들어갈수가 없는 구조(분모에 n이 들어갈 경우 3차항에서 2차항으로 내려감)
            // 즉 분모의 상수만 알아내면 되는 구조
            // 결과에 7이 35이므로
            // n이 7일때 n-2 * n-1 * n = 5 * 6 * 7 = 210 = 35c  c는 210/35이므로 6
            // 즉, n-2 * n-1 * n / 6 = n^3 - 3n^2 + 2n / 6
            long n = Long.parseLong(br.readLine());

            System.out.println(((n * n * n) - 3 * (n * n) + 2 * n)/6);
            System.out.println(3);

        } catch(Exception e) {

        }
    }
}
