package stage13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main_18870 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");
            int[] list = new int[count];
            int[] origin = new int[count];
            Map<Integer, Integer> order = new HashMap<>();

            for(int i = 0; i < data.length; i++) {
                list[i] = Integer.parseInt(data[i]);
                origin[i] = Integer.parseInt(data[i]);
            }

            Arrays.sort(list);

            int orderNumber = 0;
            for(int value: list) {
                if(order.get(value) == null) {
                    order.put(value, orderNumber);
                    orderNumber++;
                }
            }

            for(int value: origin) {
                sb.append(order.get(value)).append(" ");
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
