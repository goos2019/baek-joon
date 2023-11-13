package stage15;

import java.io.*;
import java.util.*;

public class Main_1735 {

    public static void main(String[] vAlUe) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] data1 = br.readLine().split(" ");
            String[] data2 = br.readLine().split(" ");
            int A1, A2, B1, B2 = 0;

            if(Integer.parseInt(data1[1]) > Integer.parseInt(data2[1])) {
                A1 = Integer.parseInt(data1[0]);
                B1 = Integer.parseInt(data1[1]);
                A2 = Integer.parseInt(data2[0]);
                B2 = Integer.parseInt(data2[1]);
            } else {
                A1 = Integer.parseInt(data2[0]);
                B1 = Integer.parseInt(data2[1]);
                A2 = Integer.parseInt(data1[0]);
                B2 = Integer.parseInt(data1[1]);
            }

            int gcd = gcdEA(B1, B2);

            // lcm(a, b) = |a * b| / gcd(a, b)
            int lcm = Math.abs(B1 * B2) / gcd;
            int sum = A1 * (lcm/B1) + A2 * (lcm/B2);

            System.out.println(sum + " " + lcm);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // a > b \ a = bq + r
    // gcd(a, b) = gcd(b, r)
    // r=0, b gcd
    static int gcdEA(int a, int b) {
        if(b == 0) return a;
        return gcdEA(b, a%b);
    }
}
