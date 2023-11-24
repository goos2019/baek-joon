package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10870_2 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) {
                System.out.println(0);
            } else {
                System.out.println(fac(N, 0, 1));
            }
        } catch(Exception e) {

        }
    }

    static int fac(int N, int pre, int next) {
        if(N < 2) {
            return next;
        } else {
            return fac(--N, next, next + pre);
        }
    }
}
