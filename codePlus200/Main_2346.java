package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2346 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();

        try {
            int count = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");

            for(int i = 0; i < count; i++) {
                list.add(Integer.parseInt(data[i]));
            }

            int idx = list.getFirst();
            int position = 0;
            list.remove(0);
            sb.append(1).append(" ");

            while(!list.isEmpty()) {

                int max = list.size();
                int realIdx = Math.abs(idx)%max;

                if(idx <= 0) {
                    if(position - realIdx < 0) {
                        position = max - realIdx;
                    } else {
                        position = position - realIdx;
                    }
                    idx = list.get(position);
                    list.remove(position);
                    sb.append(position + 1).append(" ");
                } else {
                    if(position + realIdx >= max) {
                        position = (position + realIdx)%max;
                    } else {
                        position = position + realIdx;
                    }
                    idx = list.get(position);
                    list.remove(position);
                    sb.append(position + 1).append(" ");
                }
            }

            System.out.println(sb.toString());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
