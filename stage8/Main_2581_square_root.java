package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [소수]
 * 1. 자연수 M, N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾아라
 *
 * [입력]
 * 1. 첫째 줄 M
 * 2. 둘째 줄 N
 *
 * [출력]
 * 1. 첫째 줄 합
 * 2. 둘째 줄 최솟값
 * 3. 소수가 없을 경우 -1
 */

public class Main_2581_square_root {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int first = -1;
            int sum = 0;

            for(int i = M; i <= N; i++) {

                if(i == 1) break;

                int count = 0;

                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i%j == 0) {
                        count += 1;
                        break;
                    }
                }

                if(count == 0) {
                    sum += i;
                    if(first < 0) first = i;
                }
            }

            if(first > 0) System.out.println(sum);
            System.out.println(first);
        } catch (Exception e) {

        }
    }
}