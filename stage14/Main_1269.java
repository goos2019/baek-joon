package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1269 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] AB = br.readLine().split(" ");
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);

            Set<Integer> data = new HashSet<>();

            for (String value : br.readLine().split(" ")) {
                data.add(Integer.parseInt(value));
            }

            int count = 0;

            for (String value : br.readLine().split(" ")) {
                if (data.contains(Integer.parseInt(value))) {
                    ++count;
                }
            }

            System.out.println(A + B - (count * 2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}