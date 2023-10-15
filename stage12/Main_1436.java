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
public class Main_1436 {
    public static void main(String[] args) {

        // 0 // [0]666 -> n[666]
        // 0 //        [0]1666 2666 3666 4666 5666
        // 0 //        6660 6661 6662 6663 6664 6665 6666 6667 6668 6669
        // 0 //        7666 8666 9666 => 19개
        // 1 //        10666 11666 12666 13666 14666 15666
        // 1 //        16660 16661 16662 16663 16664 16665 16666 16667 16668 16669
        // 1 //        17666 18666 19666 => 19개
        // -> 공식은 나중에 찾기
        // [브루트 포스로 진행]
        // 1. 반복문으로 무한대로 진행
        // 2. 숫자안에 연결된 666이 있는지 확인
        // 3. 있으면 count가 증가
        // 4. 해당 count 발견시 종료

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            short N = (short)Integer.parseInt(br.readLine());
            short count = 0;
            int num = 666;
            int pre_digit = 0;
            int pre_exp = 0;
            int post_digit = 0;
            int post_exp = 0;

            while(true) {

                if(pre_digit%10 == 0) {
                    pre_exp += 1;
                }

                if((pre_digit/Math.pow(10, pre_exp))%10 == 6) {

                } else {
                    ++pre_digit;
                }

                if(String.valueOf(num).contains("666")) {
                    ++count;
                }
            }

        } catch(Exception e) {

        }
    }
}