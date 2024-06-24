package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9663 {

    static boolean[][] chessBoard;
    static int[] array;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
           int N = Integer.parseInt(br.readLine());
           chessBoard = new boolean[N][N];
           array = new int[N];

           Main_9663 main = new Main_9663();
           main.NQ(N, 0, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 1. 첫말을 기준으로 찾아감 -> 첫말을 기준으로 매번 첫말을 달리 지정
    // 2. 첫말을 놓았을 경우 해당 x, y축 전부다 true로 변경
    // 3. 이후 처음 발견하는 false를 N번째말로 지정
    // 4. 2, 3번을 반복하며 N, N 체스판 마지막 자리까지 확인
    // 5. 1번에서 첫말이 있던 다음칸에 첫말을 놓으며 반복

    public static void NQ(int N, int count, int depth) {
        if(N == depth) {
            for(int i: array) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {

            for(int j = 0; j < N; j++) {

                checkBoard(N, i, j);

                for(int k = 0; i < N; k++) {
                    array[depth] = i + 1;
                    NQ(N, , depth + 1);
                }
            }
        }
    }

    public static void checkBoard(int N, int X, int Y) {

        // X축
        for(int i = 0; i < N; i++) {
            chessBoard[X][i] = true;
        }

        // Y축
        for(int i = 0; i < N; i++) {
            chessBoard[i][Y] = true;
        }

        // 1사
        for(int i = 1; X - i >= 0 && Y + i < N; i++) {
            chessBoard[X - i][Y + i] = true;
        }

        // 2사
        for(int i = 1; X - i >= 0 && Y - i >= 0; i++) {
            chessBoard[X - i][Y - i] = true;
        }

        // 3사
        for(int i = 1; X + i < N && Y - i >= 0; i++) {
            chessBoard[X + i][Y - i] = true;
        }

        // 4사
        for(int i = 1; X + i < N && Y + i < N; i++) {
            chessBoard[X + i][Y + i] = true;
        }
    }
}
