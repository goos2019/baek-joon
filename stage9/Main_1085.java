package stage9;

import java.io.*;

/**
 * [직사각형에서 탈출]
 * 1. 한수는 X,Y에 있음
 * 2. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭지점은(0, 0), 오른쪽 위 꼭지점은(w, h)
 * 3. 한수가 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성해라
 * [입력]
 * 1. 한수의 위치를 나타내는 X, Y
 * 2. 직사각형을 그리기 위한 W, H
 * [출력]
 * 1. 거리 값
 */
public class Main_1085 {

    public static void main(String[] args) {

        // 1. 한수는 무조건 직사각형의 안에 있음
        // 2. 꼭지점 기준 X축으로 좌, 우 Y축 상, 하 총 4개의 방향
        // 3. 비교는 0, 0으로 비교(하, 좌) W, H로 비교(상, 우)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] value = br.readLine().split(" ");

            int X = Integer.parseInt(value[0]);
            int Y = Integer.parseInt(value[1]);
            int W = Integer.parseInt(value[2]);
            int H = Integer.parseInt(value[3]);

            int XW = Math.abs(W-X);
            int YH = Math.abs(H-Y);

            if(X < XW) XW = X;
            if(Y < YH) YH = Y;

            int min = XW;

            if(XW >= YH) min = YH;

            System.out.println(min);

        } catch(Exception e) {}
    }
}
