package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10813 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int[] basket = new int[N + 1];

            for(int i = 1; i <= N; i++) {
                basket[i] = i;
            }

            for(int count = 0; count < M; count++) {
                String[] ij = br.readLine().split(" ");
                int i = Integer.parseInt(ij[0]);
                int j = Integer.parseInt(ij[1]);

                int tmp = basket[i];
                basket[i] = basket[j];
                basket[j] = tmp;
            }

            for(int i = 1; i <= N; i++) {
                sb.append(basket[i]).append(" ");
            }
            System.out.println(sb);

        } catch(Exception e) {

        }
    }
}
