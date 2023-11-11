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

            Set<Integer> aData = new HashSet<>();
            Set<Integer> bData = new HashSet<>();

            for (String data : br.readLine().split(" ")) {
                aData.add(Integer.parseInt(data));
            }

            for (String data : br.readLine().split(" ")) {
                bData.add(Integer.parseInt(data));
            }

            int count = 0;

            for (int value : aData) {
                if (aData.contains(value)) {
                    ++count;
                }
            }

            System.out.println(aData.size() + bData.size() - (count * 2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}