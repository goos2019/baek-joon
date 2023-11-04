package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_1181 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            String[] list = new String[count];

            for(int i = 0; i < list.length; i++) {
                list[i] = br.readLine();
            }

            Arrays.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() != o2.length()? o1.length() - o2.length(): o1.compareTo(o2);
                }
            });

            String after = "";

            for(int i = 0; i < list.length; i++) {
                if(!after.equals(list[i])) {
                    sb.append(list[i]).append('\n');
                }
                after = list[i];
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
