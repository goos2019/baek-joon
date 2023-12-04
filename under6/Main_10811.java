package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10811 {

    static int[] basket;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            basket = new int[N + 1];
            for(int i = 0; i <= N; i++) {
                basket[i] = i;
            }
            for(int mCount = 0; mCount < M; mCount++) {
                String[] ij = br.readLine().split(" ");
                int i = Integer.parseInt(ij[0]);
                int j = Integer.parseInt(ij[1]);
                sw(i, j);
            }
            for(int i = 1; i <= N; i++) {
                sb.append(basket[i]).append(" ");
            }
            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void sw(int i, int j) {
        if(i > j) return;
        int temp = basket[i];
        basket[i] = basket[j];
        basket[j] = temp;
        sw(++i, --j);
    }
}