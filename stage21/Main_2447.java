package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2447 {

    static String[][] tmp;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            tmp = new String[N][N];
            tmp[0][0] = "*";
            fac(1, N);
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    sb.append(tmp[i][j]);
                }
                sb.append("\n");
            }
            System.out.print(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void fac(int size, int N) {
        if(size == N) return;
        for(int i = 0; i < size*3; i++) {
            for(int j = 0; j < size*3; j++) {
                if(i/size == 1 && j/size == 1) {
                    tmp[i][j] = " ";
                    continue;
                }
                int x = i%size;
                int y = j%size;
                String temp = tmp[x][y];
                tmp[i][j] = temp;
            }
        }
        fac(size*3, N);
    }
}
