package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_10989 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            int[] list = new int[10001];

            for(int i = 0; i < N; i++) {
                int value = Integer.parseInt(br.readLine());
                list[value] = list[value] + 1;
            }

            for(int i = 0; i < 10001; i++) {
                if(list[i] != 0) {
                    for(int j = 0; j < list[i]; j++) {
                        sb.append(i).append('\n');
                    }
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
