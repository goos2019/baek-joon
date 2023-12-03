package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main_11729 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            sb.append((int)Math.pow(2, N) - 1 + "\n");
            hanoi(N, 1, 2, 3);
            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    static void hanoi(int N, int from, int by, int to) {
        if(N == 0) return;
        hanoi(N - 1, from, to, by);
        sb.append(from + " " + to + "\n");
        hanoi(N - 1, by, from, to);
    }
}