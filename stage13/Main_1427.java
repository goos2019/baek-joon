package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_1427 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] line = br.readLine().split("");
            Integer[] value = new Integer[line.length];

            for(int i = 0; i < line.length; i++) {
                value[i] = Integer.parseInt(line[i]);
            }

            Arrays.sort(value, Collections.reverseOrder());

            for(int i = 0; i < value.length; i++) {
                sb.append(value[i]);
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
