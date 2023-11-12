package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13241 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] values = br.readLine().split(" ");
            long a = Math.max(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
            long b = Math.min(Integer.parseInt(values[0]), Integer.parseInt(values[1]));

            long gcd = gcdEA(a, b);

            System.out.println(Math.abs(a * b)/gcd);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // a > b | a = bq + r
    // gcd(a, b) = gcd(b, r)
    public static long gcdEA(long a, long b) {
        if(b == 0) return a;
        return gcdEA(b, a%b);
    }
}
