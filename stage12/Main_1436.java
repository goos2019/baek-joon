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
        // 6 //        61666 62666 63666 64666 65666
        // 6 //        66600 66601 ... 66699
        // 6 //        67666 68666 69666
        // 16 //       160 161 162 163 164 165
        // 16 //       166600 ~ 99
        // 16 //       167 168 169
        // 61 //       610 611 612 613 614 615
        // 61 //       616660
        // 66 //       660 661 662 663 664 665
        // 66 //       666000 ... 666999
        // 66 //       667666 ... 668666 669666
        // -> 공식은 나중에 찾기
        // 1. 앞자리수가 증가
        // 2. 앞자리수의 마지막이 6인경우 뒷자리수를 추가 계산 이때 앞자리수의 6의 개수에 따라 뒷자리의 추가 계산이 증가

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            short N = (short)Integer.parseInt(br.readLine());
            short count = 1;
            int pre_digit = 0;
            int pre_exp = 0;
            int post_digit = 0;
            int post_exp = 0;
            int total_digit = 3;

            while(true) {

                if(N == count) {
                    System.out.println(pre_digit + total_digit + post_digit);
                }

                count++;

                // 자리수 증감
                if(pre_digit%Math.pow(10, pre_exp) == 0) {
                    pre_exp++;
                    total_digit++;
                }

                if(post_digit%Math.pow(10, post_exp) == 0) {
                    post_exp++;
                    post_digit = 0;
                }

                if(pre_digit%Math.pow(10, pre_exp) == 6) {



                } else {
                    pre_digit++;
                }

            }

        } catch(Exception e) {

        }
    }
}