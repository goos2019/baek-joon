package stage20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_20920 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            Map<String, Integer> note = new HashMap<>();

            for(int i = 0; i < N; i++) {
                String data = br.readLine();
                if(data.length() >= M) {
                    if(!note.containsKey(data)) {
                        note.put(data, 1);
                    } else {
                        note.put(data, note.get(data) + 1);
                    }
                }
            }

            ArrayList<String> keySet = new ArrayList<>(note.keySet());

            keySet.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int order = note.get(o2) - note.get(o1);
                    if(order == 0) {
                        order = o2.length() - o1.length();
                    }
                    if(order == 0) {
                        order = o1.compareTo(o2);
                    }
                    return order;
                }
            });

            for(String key: keySet) {
                sb.append(key).append('\n');
            }
            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}