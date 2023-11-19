package stage19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11050 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] NK = br.readLine().split(" ");
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
            long num1 = 1;
            long num2 = 1;

            for(int i = N; i > (N - K); i--) {
                num1 *= i;
            }

            for(int i = 1; i <= K; i++) {
                num2 *= i;
            }

            System.out.println(num1/num2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
