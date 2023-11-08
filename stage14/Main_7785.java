package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_7785 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int n = Integer.parseInt(br.readLine());
            Map<String, String> log = new HashMap<>();

            for(int i = 0; i < n; i++) {
                String[] data = br.readLine().split(" ");
                log.put(data[0], data[1]);
            }

            ArrayList<String> keySet = new ArrayList<>(log.keySet());

            keySet.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });

            for(String str: keySet) {
                if(log.get(str).equals("enter")) {
                    sb.append(str).append('\n');
                }
            }

            System.out.print(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
