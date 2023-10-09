package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [대지]
 * 1. 모든 지점을 포함하는 가장 작은 남북, 동서 방향으로 평행한 변을 갖는 직사각형의 넓이를 출력
 * [입력]
 * 1. 점의 수 N
 * 2. 각 점의 값들
 */
public class Main_9063 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            int[] low = new int[2];
            int[] high = new int[2];

            for(int i = 0; i < n; i++) {

                String[] c = br.readLine().split(" ");
                int x = Integer.parseInt(c[0]);
                int y = Integer.parseInt(c[1]);

                if(i != 0) {
                    if(x > high[0]) high[0] = x;
                    if(x < low[0]) low[0] = x;
                    if(y > high[1]) high[1] = y;
                    if(y < low[1]) low[1] = y;
                } else {
                    low[0] = high[0] = x;
                    low[1] = high[1] = y;
                }
            }

            result = (high[0] - low[0]) * (high[1] - low[1]);

            System.out.println(result);

        } catch(Exception e) {

        }
    }
}
