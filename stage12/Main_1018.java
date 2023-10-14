package stage12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [체스판 다시 칠하기]
 * 1. MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드
 * 2. 떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다
 * 3. 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다
 * 4. 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
 *  - 각 칸이 검은색과 흰색 중 하나로 색칠
 *  - 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다
 *  - 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우
 *  5. 보드가 체스판처럼 칠해져 있다는 보장이 없음
 *  6. 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠할경우 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
 * [입력]
 * 1. 첫째 줄에는 N과 M이 주어짐 N과 M은 8보다 크거나 같고 50보다 작거나 같은 자연수
 * 2. 둘째 줄은 N개의 줄에 보드의 각 행의 상태가 주어짐 검은색은 B로 흰색은 W로 입력된다
 * [출력]
 * 1. 칠해야하는 최솟값을 구해라
 */
public class Main_1018 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            // 8 x 8의 채를 만들어서 해당 채에서 칠할수 있는 최소값들을 계산
            // 시작점은 왼쪽 위부터
            // 왼쪽 칸이 흰색일 경우와 검은색일 경우 각각 칠해야하는 갯수가 다르므로 2번 계산해야 함
            // 가로는 0 ~ N - 8까지, 세로는 0 ~ M - 8까지 확인

            String[] matrix = br.readLine().split(" ");
            int col = Integer.parseInt(matrix[0]);
            int row = Integer.parseInt(matrix[1]);
            String[][] board = new String[col][row];

            for(int i = 0; i < col; i++) {
                String[] line = br.readLine().split("");
                board[i] = line;
            }

            // 칠해야하는 최대 정사각형의 수
            int min = 64;

            for(int i = 0; i <= col - 8; i++) {
                for(int j = 0; j <= row - 8; j++) {
                    // i, j시작 좌표

                    int w = 0;
                    int b = 0;

                    // 정사각형 확인
                    for(int x = 0; x < 8; x++) {
                        for(int y = 0; y < 8; y++) {

                            String target = board[x + i][y + j];

                            // 흰색일때
                            // 순서 홀수(0 2 4 6)
                            if((y + x%2)%2 == 0) {
                                //
                                if(!target.equals("W")) w += 1;
                            // 순서 짝수(1 3 5 7)
                            } else if((y + x%2)%2 == 1) {
                                if(target.equals("W")) w += 1;
                            }

                            // 검은색일때
                            // 순서 홀수(0 2 4 6)
                            if((y + x%2)%2 == 0) {
                                if(!target.equals("B")) b += 1;
                            // 순서 짝수(1 3 5 7)
                            } else if((y + x%2)%2 == 1) {
                                if(target.equals("B")) b += 1;
                            }
                        }
                    }

                    if(b < min) min = b;
                    if(w < min) min = w;
                }
            }

            System.out.println(min);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

