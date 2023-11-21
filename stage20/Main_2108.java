package stage20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2108 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            double sum = 0;
            int freq = 0;
            int[] data = new int[count];
            ArrayList<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < count; i++) {
                int value = Integer.parseInt(br.readLine());
                sum += value;
                data[i] = value;
                if(!map.containsKey(value)) {
                    map.put(value, 1);
                    if(1 > freq) {
                        freq = 1;
                        list.add(value);
                    }
                } else {
                    int getCount = map.get(value) + 1;
                    map.put(value, getCount);
                    if(getCount > freq) {
                        freq = getCount;
                        list.clear();
                        list.add(value);
                    } else {
                        list.add(value);
                    }
                }
            }

            Arrays.sort(data);
            Collections.sort(list);

            System.out.println((int)Math.round(sum/count));

            if(data.length%2 == 0) {
                System.out.println((int)Math.round((data[data.length/2] + data[data.length/2 - 1])/2.0));
            } else {
                System.out.println(data[data.length/2]);
            }

            if(list.size() > 1) {
                System.out.println(list.get(1));
            } else {
                System.out.println(list.get(0));
            }

            System.out.println(data[data.length - 1] - data[0]);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}