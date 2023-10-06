package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [소수 찾기]
 * 1. 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력
 * [input]
 * 1. 첫줄에 줄의 개수 N이 주어짐 다음으로 N개의 수가 주어짐
 */
public class Main_1978 {

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
                for(int j = 2; j < number; j++) {
                    if(number%j == 0) {
                        ++count;
                        break;
                    }
                }

                if(count == 0 && number != 1) ++primeNumberCount;
            }
            System.out.println(primeNumberCount);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}