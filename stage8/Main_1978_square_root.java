package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [약수 구하기]
 * 1. 자연수 p, q가 있을때 p를 q로 나누었을때 나머지가 0이면 q는 p의 약수
 * 2. 자연수 N과 K가 주어졌을 때, N의 약수 중 K번째로 작은 수를 출력
 * 3. K번째 약수가 없으면 0을 출력
 */
public class Main_1978_square_root {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            String[] nNumber = br.readLine().split(" ");

            int primeNumberCount = 0;

            // N번 반복
            for(int i = 0; i < N; i++) {

                // 확인 해야할 수
                int number = Integer.parseInt(nNumber[i]);

                // 소수인지 확인하는 플래그
                int count = 0;

                // 소수를 검증
                for(int j = 2; j <= Math.sqrt(number); j++) {
                    if(number%j == 0) {
                        ++count;
                        break;
                    }
                }

                if(count == 0 && number != 1) ++primeNumberCount;
            }
            System.out.println(primeNumberCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
