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
            ArrayList<String> log = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                String[] data = br.readLine().split(" ");
                if(data[1].equals("enter")) {
                    log.remove(data[0]);
                    log.add(data[0]);
                } else if(data[1].equals("leave")) {
                    log.remove(data[0]);
                }
            }

            log.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.charAt(0) - o2.charAt(0);
                }
            });

            for(String str: log) {
                sb.append(str).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
