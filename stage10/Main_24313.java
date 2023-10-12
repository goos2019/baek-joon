package stage10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_24313 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // a1 * n + a0 <= C * n0를 만족할 경우에만 1을 출력
            String[] a = br.readLine().split(" ");
            long a1 = Long.parseLong(a[0]);
            long a0 = Long.parseLong(a[1]);

            long c = Long.parseLong(br.readLine());
            long n0 = Long.parseLong(br.readLine());

            double low = (double)a0/(c-a1);

            if(((a1 * n0) + a0) <= (c * n0) && low <= n0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        } catch(Exception e) {

        }
    }
}
