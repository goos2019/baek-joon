package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15649 {

    static int[] valueArray;
    static boolean[] visit;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            valueArray = new int[M];
            visit = new boolean[N];
            Main_15649 main = new Main_15649();
            main.NM(N, M, 0);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void NM(int N, int M, int depth) {

        if(depth == M) {
            for(int value : valueArray) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {

            if(visit[i] == false) {

                visit[i] = true;
                valueArray[depth] = i + 1;
                NM(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}
