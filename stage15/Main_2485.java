package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2485 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            int first = Integer.parseInt(br.readLine());
            int before = Integer.parseInt(br.readLine());
            int last = 0;
            int gcd = 0;

            for(int i = 2; i < count; i++) {
                int value = Integer.parseInt(br.readLine());
                int afterGcd = gcd(before - first, value - first);
                before = value;
                if(gcd == 0) {
                    gcd = afterGcd;
                } else if(gcd > afterGcd) {
                    gcd = gcd(gcd, afterGcd);
                } else {
                    gcd = gcd(afterGcd, gcd);
                }

                if(i == (count - 1)) {
                    last = value;
                }
            }

            System.out.println((last - first)/gcd - count + 1);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
