package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15650 {

    static boolean[] visit;
    static int[] val;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            visit = new boolean[N + 1];
            val = new int[M];

            Main_15650 main = new Main_15650();
            main.NM(N, M, 0, 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void NM(int N, int M, int depth, int position) {

        if(depth == M) {
            for(int i: val) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i = position; i <= N; i++) {
            System.out.println("+");
            val[depth] = i;
            NM(N, M, depth + 1, i + 1);
        }
    }
}
