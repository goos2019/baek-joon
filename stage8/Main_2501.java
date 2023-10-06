package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [약수 구하기]
 * 1. 자연수 p, q가 있을때 p를 q로 나누었을때 나머지가 0이면 q는 p의 약수
 * 2. 자연수 N과 K가 주어졌을 때, N의 약수 중 K번째로 작은 수를 출력
 * 3. K번째 약수가 없으면 0을 출력
 */
public class Main_2501 {

    public static void main(String[] args) {

        // 간단하게

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] data = br.readLine().split(" ");

            int N = Integer.parseInt(data[0]);
            int K = Integer.parseInt(data[1]);

            int count = 0;
            int result = 0;

            for(int i = 1; i <= N; i++) {
                if(N%i == 0) ++count;
                if(count == K) {
                    result = i;
                    break;
                }
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
