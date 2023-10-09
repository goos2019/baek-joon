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

public class Main_2581 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long beforeTime = System.currentTimeMillis();
        try {
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            boolean[] sieve = new boolean[N + 1];

            sieve[0] = sieve[1] = true;

            for (int i = 2; i <= Math.sqrt(N); i++) {

                if (sieve[i]) continue;

                for (int j = i * i; j < sieve.length; j += i) {
                    sieve[j] = true;
                }
            }

            int sum = 0;
            int first = -1;

            for (int i = M; i <= N; i++) {
                if(!sieve[i]) {
                    sum += i;
                    if(first < 0) first = i;
                }
            }

            if(first > 0) System.out.println(sum);
            System.out.println(first);
        } catch (Exception e) {

        }
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        double secDiffTime = (afterTime - beforeTime) / 1000.0; //두 시간에 차 계산
        System.out.println("수행시간(m) : " + secDiffTime);
    }
}
