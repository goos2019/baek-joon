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

            visit = new boolean[N];
            val = new int[M];

            Main_15650 main = new Main_15650();
            main.NM(N, M, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void NM(int N, int M, int depth) {

        if(depth == M) {
            for(int i: val) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {

            if(visit[i] == false) {

                visit[i] = true;
                val[depth] = i + 1;
                NM(N, M, depth + 1);
                if(N != M && val[0] < val[depth]) {
                    visit[i] = false;
                }
            }
        }
    }
}
