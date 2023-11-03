package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_11651 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            int[][] dataSet = new int[count][2];

            for(int i = 0; i < count; i++) {
                String[] axis = br.readLine().split(" ");
                dataSet[i][0] = Integer.parseInt(axis[0]);
                dataSet[i][1] = Integer.parseInt(axis[1]);
            }

            Arrays.sort(dataSet, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] != o2[1]? o1[1] - o2[1] : o1[0] - o2[0];
                }
            });

            for(int[] data: dataSet) {
                sb.append(data[0]).append(" ").append(data[1]).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
