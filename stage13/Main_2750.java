package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2750 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            int[] list = new int[count];

            for(int i = 0; i < count; i++) {
                int value = Integer.parseInt(br.readLine());
                list[i] = value;
            }

            Arrays.sort(list);

            for(int i: list) {
                System.out.println(i);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
