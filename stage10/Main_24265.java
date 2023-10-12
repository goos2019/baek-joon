package stage10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_24265 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // MenOfPassion는 삼중 for문
            // 외곽 n
            // 내부 n
            // 중심 n
            // n^3
            long n = Long.parseLong(br.readLine());

            System.out.println(n * n * n);
            System.out.println(3);

        } catch(Exception e) {

        }
    }
}
