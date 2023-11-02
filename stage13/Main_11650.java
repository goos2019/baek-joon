package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_11650 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            int[][] multi = new int[count][2];

            for(int i = 0; i < count; i++) {
                String[] axis = br.readLine().split(" ");
                multi[i][0] = Integer.parseInt(axis[0]);
                multi[i][1] = Integer.parseInt(axis[1]);
            }

            Arrays.sort(multi, Comparator.comparingInt(o -> o[0]));
            Arrays.sort(multi, Comparator.comparingInt(o -> o[1]));

            for (int[] ints : multi) {
                sb.append(ints[0]).append(" ").append(ints[1]).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
