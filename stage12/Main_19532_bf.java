package stage12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [수학은 비대면강의입니다]
 * 1. 연립방정식 x, y 값을 계산
 * 2. ax + by = c / dx + ex = f
 * [입력]
 * 1. a, b, c, d, e, f 가 공백으로 주어짐 -999 ≤ a, b, c, d, e, f ≤ 999
 * 2. x, y가 유일하고 -999이상 999이하의 정수민 경우만 주어짐
 * [출력]
 * 1.x, y를 공백으로 구분해서 출력
 */
public class Main_19532_bf {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            String[] read = br.readLine().split(" ");
            int a = Integer.parseInt(read[0]);
            int d = Integer.parseInt(read[3]);
            int b = Integer.parseInt(read[1]);
            int e = Integer.parseInt(read[4]);
            int c = Integer.parseInt(read[2]);
            int f = Integer.parseInt(read[5]);

            for(int x = -999; x <= 999; x++) {
                for(int y = -999; y <= 999; y++) {
                    if(a*x + b*y == c && d*x + e*y == f) {
                        System.out.println(x + " " + y);
                    }
                }
            }
        } catch(Exception e) {

        }
    }
}
