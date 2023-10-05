package stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [분수 찾기]
 * 1. 지그재그로 진행
 * 2. 숫자가 주어졌을때 해당 분수를 구하는 프로그램
 */
public class Main_1193 {

    // 그룹을 구함
    // 1번 그룹 (1) : 1/1
    // 2번 그룹 (2~3) : 2/1, 1/2
    // 3번 그룹 (4~6) : 3/1, 2/2, 1/3
    // 해당 그룹의 방향을 정함 top -> bottom / bottom -> top
    // 1번 그룹 : +
    // 2번 그룹 : -
    // 3번 그룹 : +
    // 4번 그룹 : -
    // 5번 그룹 : +
    // +면 분자가 최대에서 감소 -면 분모가 최대에서 감소
    // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 ...

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            int num = Integer.parseInt(br.readLine());

            int group = 1;
            int max = 1;

            while(true) {

                if(num <= max) break;

                ++group;
                max += group;
            }

            int top = 0;
            int bottom = 0;

            if(group%2 == 0) {
                top = group - (max - num);
                bottom = 1 + (max - num);
            } else {
                top = 1 + (max - num);
                bottom = group - (max - num);
            }

            System.out.println(top + "/" + bottom);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
