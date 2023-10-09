package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * [약수 구하기]
 * 1. 자연수 p, q가 있을때 p를 q로 나누었을때 나머지가 0이면 q는 p의 약수
 * 2. 자연수 N과 K가 주어졌을 때, N의 약수 중 K번째로 작은 수를 출력
 * 3. K번째 약수가 없으면 0을 출력
 */
public class Main_1978_sieve_of_eratosthenes {

    public static void main(String[] args) {

        // 확인 해야할 수
        int number = 10000000;
        System.out.println("자연수 : " + number);

        try {
            System.out.println("[브루트포스]");
            long beforeTime = System.currentTimeMillis();
            // 소수를 검증
            boolean[] list1 = new boolean[number + 1];

            for(int j = 2; j < number; j++) {
                if(number%j == 0) {
                    list1[j] = true;
                }
            }
            System.out.println("확인");
            long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
            long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
            System.out.println("수행시간(m) : " + secDiffTime);

            System.out.println("[제곱근]");
            beforeTime = System.currentTimeMillis();
            // 소수를 검증
            boolean[] list2 = new boolean[number + 1];

            for(int j = 2; j <= Math.sqrt(number); j++) {
                if(number%j == 0) {
                    list2[j] = true;
                }
            }
            System.out.println("확인");
            afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
            secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
            System.out.println("수행시간(m) : " + secDiffTime);

            System.out.println("[에라토스테네스의 체]");
            beforeTime = System.currentTimeMillis();
            // 소수를 검증
            boolean[] list3 = new boolean[number + 1];

            for(int j = 2; j <= Math.sqrt(number); j++) {
                if(list3[j]) continue;

                for(int i = j * j; i < number; i += j) {
                    list3[i] = true;
                }
            }
            System.out.println("확인");
            afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
            secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
            System.out.println("수행시간(m) : " + secDiffTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
