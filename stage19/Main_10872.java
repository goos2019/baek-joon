package stage19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10872 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            long pac = 1;
            for(int i = 1; i <= N; i++) {
                pac *= i;
            }
            System.out.println(pac);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
