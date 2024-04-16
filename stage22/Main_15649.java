package stage22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15649 {

    static String[] data;
    static boolean[] data2;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            data = new String[999999];
            NM(N, M, 1, 1, 0);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void NM(int N, int M, int start, int end, int line) {
        if(start == N) return;

        NM(N, M, ++start, end, line);
        System.out.print(start);
        NM(N, M, start, ++end, line);
        System.out.println(end);
    }
}
