package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15652 {

    static StringBuilder sb;
    static int[] array;
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            sb = new StringBuilder();
            array = new int[M];

            Main_15652 main = new Main_15652();

            main.NM(N, M, 0, 0);
            System.out.print(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void NM(int N, int M, int depth, int positon) {
        if(depth == M) {
            for(int i: array) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            if(i + 1 >= positon) {
                array[depth] = i + 1;
                NM(N, M, depth + 1, i + 1);
            }
        }
    }
}
