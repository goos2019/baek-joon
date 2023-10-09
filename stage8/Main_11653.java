package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * [소인수분해]
 * 1. 정수 N이 주어졌을 때, 소인수분해
 * 
 * [입력]
 * 1. 첫째 줄 N
 *
 * [출력]
 * 1. 소인수분해 결과를 오름차순으로 출력
 * 2. N이 1인 경우 아무것도 출력하지 않음
 */

public class Main_11653 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());

            for(int i = 2; i <= Math.sqrt(N); i++) {
                while(N%i == 0) {
                    N /= i;

                    System.out.println(i);
                }
            }

            if(N != 1) System.out.println(N);
        } catch (Exception e) {

        }
    }
}