package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_10814 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            String[][] list = new String[count][2];

            for(int i = 0; i < list.length; i++) {
                String[] data = br.readLine().split(" ");
                list[i][0] = data[0];
                list[i][1] = data[1];
            }

            Arrays.sort(list, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    int age1 = Integer.parseInt(o1[0]);
                    int age2 = Integer.parseInt(o2[0]);
                    return age1 != age2 ? age1 - age2 : 0;
                }
            });

            for(String[] data: list) {
                sb.append(data[0]).append(" ").append(data[1]).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
