package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9663 {

    static boolean[] chessBoard;
    static int[] array;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
           int N = Integer.parseInt(br.readLine());

           chessBoard = new boolean[N];
           array = new int[N];

           Main_9663 main = new Main_9663();
           main.NQ(N, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //

    public static void NQ(int N, int depth) {
        if(N == depth) {
            for(int i: array) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {

            array[depth] = i + 1;
            NQ(N, depth + 1);

        }
    }
}
