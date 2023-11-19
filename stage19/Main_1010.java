package stage19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1010 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int count = Integer.parseInt(br.readLine());

            for(int i = 0; i < count; i++) {

                String[] NK = br.readLine().split(" ");
                int A = Integer.parseInt(NK[0]);
                int B = Integer.parseInt(NK[1]);

                sb.append(comb(A, B)).append('\n');
            }

            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static long comb(int A, int B) {

        int N, K;
        boolean[] listN, listK;

        if(A > B) {
            N = A;
            K = B;
        } else {
            N = B;
            K = A;
        }

        listN = new boolean[N + 1];
        listK = new boolean[N + 1];

        long num1 = 1;
        long num2 = 1;

        for(int i = N; i > (N - K); i--) {
            listN[i] = true;
        }

        for(int i = 1; i <= K; i++) {
            listK[i] = true;
        }

        for(int i = 1; i <= N; i++) {
            if(listN[i] == listK[i]) {
                listN[i] = false;
                listK[i] = false;
            }
        }

        for(int i = 1; i <= N; i++) {
            if(listN[i]) num1 *= i;
            if(listK[i]) num2 *= i;
        }

        return num1/num2;
    }
}
