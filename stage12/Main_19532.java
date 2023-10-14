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
public class Main_19532 {
    public static void main(String[] args) {

        // n개 중 중복되지 않는 경우를 찾아서 최대 수를 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            // 연립방정식의 해 계산
            // ax + by = c
            // dx + ey = f
            // y = af - dc / ae - db
            // x = bf - ec / db - ea
            
            String[] read = br.readLine().split(" ");
            int a = Integer.parseInt(read[0]);
            int d = Integer.parseInt(read[3]);
            int b = Integer.parseInt(read[1]);
            int e = Integer.parseInt(read[4]);
            int c = Integer.parseInt(read[2]);
            int f = Integer.parseInt(read[5]);

            int x = (b*f - e*c) / (d*b - e*a);
            int y = (a*f - d*c) / (a*e - d*b);

            System.out.println(x + " " + y);

        } catch(Exception e) {

        }
    }
}
