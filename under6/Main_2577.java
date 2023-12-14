package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2577 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int[] array = new int[10];
            long multi = 1;
            for(int i = 0; i < 3; i++) {
                int value = Integer.parseInt(br.readLine());
                multi *= value;
            }
            String[] data = String.valueOf(multi).split("");
            for(String strNumber : data) {
                int index = Integer.parseInt(strNumber);
                int count = array[index];
                array[index] = count + 1;
            }
            for(int value : array) {
                System.out.println(value);
            }
        } catch(Exception e) {

        }
    }
}
