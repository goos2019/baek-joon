package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13909 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // [1]
            // 1
            // -1
            // [2]
            // 11
            // 10
            // -1
            // [3]
            // 111
            // 101
            // 100
            // -1
            // [4]
            // 1111
            // 1010
            // 1000
            // 1001
            // -2
            // [5]
            // 11111
            // 10101
            // 10001
            // 10011
            // 10010
            // -2
            // [6]
            // 111111
            // 101010
            // 100011
            // 100111
            // 100101
            // 100100
            // -2
            // [7]
            // 1111111
            // 1010101
            // 1000111
            // 1001111
            // 1001011
            // 1001001
            // 1001000
            // -2
            // [8]
            // 11111111
            // 10101010
            // 10001110
            // 10011111
            // 10010111
            // 10010011
            // 10010001
            // 10010000
            // -2
            // [9]
            // 111111111
            // 101010101
            // 100011100
            // 100111110
            // 100101110
            // 100100110
            // 100100010
            // 100100000
            // 100100001
            // -3

            // n^2 일때마다 1개씩 증가
            // 1^2 = 1 = 1
            // 2^2 = 4 = 2
            // 3^3 = 9 = 3
            // 4^4 = 16 = 4

            System.out.println((int)Math.floor(Math.sqrt(Double.parseDouble(br.readLine()))));

        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
