package stage20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_26069 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            int dance = 0;
            Set<String> set = new HashSet<>();

            for(int i = 0; i < count; i++) {
                String[] meet = br.readLine().split(" ");

                if(meet[0].equals("ChongChong")) {
                    set.add(meet[1]);
                    dance++;
                } else if(meet[1].equals("ChongChong")) {
                    set.add(meet[0]);
                    dance++;
                } else if(set.contains(meet[0])) {
                    set.add(meet[1]);
                    dance++;
                } else if(set.contains(meet[1])) {
                    set.add(meet[0]);
                    dance++;
                }
            }

            System.out.println(dance == 0? 0 : dance + 1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
