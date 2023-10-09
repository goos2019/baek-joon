package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [수학은 체육과목 입니다]
 * 1. 한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다. 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오.
 */
public class Main_15894 {

    public static void main(String[] args) {

        // 입력 n
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            System.out.println(n*4L);

        } catch(Exception e) {

        }


    }
}
