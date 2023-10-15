package stage12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [영화감독 숌]
 * 1. 종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수
 * 2. 제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, ....
 * 3. 첫 번째 영화의 제목은 "세상의 종말 666", 두 번째 영화의 제목은 "세상의 종말 1666" 일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수)
 * 4. N번째 영화의 제목에 들어간 수를 출력하는 프로그램을 작성
 * [입력]
 * 1. 첫째 줄에 N이 주어진다. N은 10,000보다 작거나 같은 자연수
 * [출력]
 * 1. 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력
 */
public class Main_1436_else {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            short count = (short)Integer.parseInt(br.readLine());
            int nth = 665;

            while(true) {
                if(count == 0) break;
                nth += 1;
                String temp = Integer.toString(nth);
                if(temp.contains("666")) {
                    count -= 1;
                }
            }
            System.out.println(nth);
        } catch(Exception e) {
        }
    }
}