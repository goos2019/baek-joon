package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10810 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int[] basket = new int[N];

            for(int ballCount = 0; ballCount < M; ballCount++) {
                String[] ijk = br.readLine().split(" ");
                int i = Integer.parseInt(ijk[0]) - 1;
                int j = Integer.parseInt(ijk[1]) - 1;
                int k = Integer.parseInt(ijk[2]);

                for(int basketNumber = i; basketNumber <= j; basketNumber++ ) {
                    if(basket[basketNumber] != k) {
                        basket[basketNumber] = k;
                    }
                }
            }

            for(int i : basket) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
