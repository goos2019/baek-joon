package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_14215 {

    public static void main(String[] args) {

        // 1. 한수는 무조건 직사각형의 안에 있음
        // 2. 꼭지점 기준 X축으로 좌, 우 Y축 상, 하 총 4개의 방향
        // 3. 비교는 0, 0으로 비교(하, 좌) W, H로 비교(상, 우)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tri = new int[3];

        try {
            String[] value = br.readLine().split(" ");

            tri[0] = Integer.parseInt(value[0]);
            tri[1] = Integer.parseInt(value[1]);
            tri[2] = Integer.parseInt(value[2]);

            Arrays.sort(tri);

            if(tri[0] + tri[1] <= tri[2]) {
                System.out.println(2*(tri[0] + tri[1]) - 1);
            } else {
                System.out.println(tri[0] + tri[1] + tri[2]);
            }

        } catch(Exception e) {}
    }
}
