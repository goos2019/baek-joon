package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_27433 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            long N = Long.parseLong(br.readLine());
            if(N == 0) {
                System.out.println(1);
            } else {
                System.out.println(fac(N));
            }
        } catch(Exception e) {

        }
    }

    static long fac(long i) {
        if(i == 1) return i;
        return i*fac(--i);
    }
}
