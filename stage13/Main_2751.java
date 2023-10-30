package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_2751 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            Integer[] list = new Integer[N];

            for(int i = 0; i < N; i++) {
                list[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(list, Collections.reverseOrder());

            for(int i: list) {
                sb.append(i).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
