package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1929 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] values = br.readLine().split(" ");
            int M = Integer.parseInt(values[0]);
            int N = Integer.parseInt(values[1]);

            boolean[] che = new boolean[N + 1];

            che[1] = true;

            for(int i = 2; i <= Math.sqrt(N); i++) {
                for(int j = 2; i*j <= N; j++) {
                    if(!che[i*j]) {
                        che[i*j] = true;
                    }
                }
            }

            for(int i = M; i <= N; i++) {
                if(!che[i]) {
                    sb.append(i).append('\n');
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
