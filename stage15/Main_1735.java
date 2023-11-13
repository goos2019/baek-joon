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

            int[] data = divValue(sum, lcm);

            System.out.println(data[0] + " " + data[1]);

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

    static int[] divValue(int a, int b) {

        int gcd = 0;

        if(a > b) {
            while(true){
                gcd = gcdEA(a, b);
                if(gcd == 1) break;
                a /= gcd;
                b /= gcd;
            }
        } else {
            while(true){
                gcd = gcdEA(b, a);
                if(gcd == 1) break;
                a /= gcd;
                b /= gcd;
            }
        }

        return new int[]{a, b};
    }
}
