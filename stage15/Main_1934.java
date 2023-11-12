package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1934 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());

            for(int i = 0; i < count; i++) {
                String[] line = br.readLine().split(" ");

                int a = Math.max(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                int b = Math.min(Integer.parseInt(line[0]), Integer.parseInt(line[1]));

                // lcm(a, b) = |ab| / gcd(a, b)
                int gcd = gcdEuclideanAlgorithm(a, b);

                sb.append(Math.abs(a * b)/gcd).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // if a > b, a = bq + r (0 <= r < b)
    // gcd(a, b) = gcd(b, r)
    // r=0 then gcd is b
    public static int gcdEuclideanAlgorithm(int A, int B) {
        if(B == 0) return A;
        return gcdEuclideanAlgorithm(B, A%B);
    }
}
