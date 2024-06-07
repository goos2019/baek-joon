package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15651 {

    static int[] array;
    static StringBuilder sb;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            array = new int[M];
            sb = new StringBuilder();

            Main_15651 main = new Main_15651();
            main.NM(N ,M, 0);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void NM(int N, int M, int depth) {

        if(depth == M) {
            for(int i: array) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            array[depth] = i + 1;
            NM(N, M, depth + 1);
        }
    }
}