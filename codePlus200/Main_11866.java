package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_11866 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] data = br.readLine().split(" ");
            int N = Integer.parseInt(data[0]);
            int K = Integer.parseInt(data[1]);
            LinkedList<Integer> ll = new LinkedList<>();

            sb.append("<");
            for(int i = 1; i <= N; i++) {
                ll.add(i);
            }

            int count = 1;
            int idx = 0;

            while(ll.size() > 1) {

                if(count == K) {
                    sb.append(ll.get(idx)).append(", ");
                    ll.remove(idx);
                    count = 0;
                } else {
                    idx = (idx + 1)%ll.size();
                }
                count++;
            }
            sb.append(ll.pop());
            sb.append(">");


            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
