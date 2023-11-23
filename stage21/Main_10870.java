package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10870 {

    static int[] list;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            list = new int[N + 1];
            System.out.println(fac(N));
        } catch(Exception e) {

        }
    }

    static int fac(int N) {
        if(N < 2) return N;
        return list[N - 2] = fac(N - 1) + fac(N - 2);
    }
}
