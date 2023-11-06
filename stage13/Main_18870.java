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
            String[] origin = data.clone();
            Map<Integer, Integer> order = new HashMap<>();

            Arrays.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.parseInt(o1) - Integer.parseInt(o2);
                }
            });

            int orderNumber = 0;
            for(String str: data) {
                if(order.get(Integer.parseInt(str)) == null) {
                    order.put(Integer.parseInt(str), orderNumber);
                    orderNumber++;
                }
            }

            for(String str: origin) {
                sb.append(order.get(Integer.parseInt(str))).append(" ");
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
