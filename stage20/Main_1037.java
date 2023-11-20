package stage20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1037 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int countN = Integer.parseInt(br.readLine());
            String[] setN = br.readLine().split(" ");

            int min = 1000000;
            int max = 0;

            for(String strValue: setN) {
                int value = Integer.parseInt(strValue);
                min = Math.min(value, min);
                max = Math.max(value, max);
            }
            System.out.println(max*min);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}