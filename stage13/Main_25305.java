package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_25305 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nAndK = br.readLine().split(" ");
            String[] data = br.readLine().split(" ");
            int N = Integer.parseInt(nAndK[0]);
            int K = Integer.parseInt(nAndK[1]);

            Integer[] list = new Integer[N];

            for(int i = 0; i < list.length; i++) {
                list[i] = Integer.parseInt(data[i]);
            }

            Arrays.sort(list, Collections.reverseOrder());

            System.out.println(list[K - 1]);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
