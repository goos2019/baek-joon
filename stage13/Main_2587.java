package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2587 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[] list = new int[5];
            int sum = 0;

            for(int i = 0; i < 5; i++) {
                int value = Integer.parseInt(br.readLine());
                sum += value;
                list[i] = value;
            }

            Arrays.sort(list);

            System.out.println(sum/5);
            System.out.println(list[2]);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
