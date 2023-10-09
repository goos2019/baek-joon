package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [네 번째 점]
 * 1. 세 점의 좌표가 한 줄에 하나씩 주어짐
 * [입력]
 * 1. 좌표 1
 * 2. 좌표 2
 * 3. 좌표 3
 * [출력]
 * 1. 좌표 4
 */
public class Main_3009 {

    public static void main(String[] args) {

        // 1. 평행한 직사각형이 되기 위해서는 각 좌표의 축이 무조건 쌍으로 있어야함
        //  - X축 위에 점 2개로 1개의 선이 정해지면 해당 가로선의 양끝점 위에서만 값이 이동
        //  - Y축 위에 점 2개로 1개의 선이 정해지면 역시 해당 세로선의 양끝점 위에서만 값이 이동
        //  - 즉, 좌표 4개의 X축 2개씩 2쌍, Y축 2개씩 2쌍이 동일해야함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[] xList = new int[3];
            int[] yList = new int[3];

            for(int i = 0; i < 3; i++){
                String[] value = br.readLine().split(" ");
                xList[i] = Integer.parseInt(value[0]);
                yList[i] = Integer.parseInt(value[1]);
            }

            int X = xList[0];
            int Y = yList[0];

            if(xList[0] == xList[2]) {
                X = xList[1];
            } else if(xList[0] == xList[1]) {
                X = xList[2];
            }

            if(yList[0] == yList[2]) {
                Y = yList[1];
            } else if(yList[0] == yList[1]) {
                Y = yList[2];
            }

            System.out.println(X + " " + Y);

        } catch(Exception e) {}
    }
}
