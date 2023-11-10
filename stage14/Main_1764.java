package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1764 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            Map<String, Integer> list = new HashMap<>();
            ArrayList<String> member = new ArrayList<>();

            for(int i = 0; i < N; i++) {
                list.put(br.readLine(), 0);
            }

            for(int i = 0; i < M; i++) {
                String longTimeNoSee = br.readLine();
                if(list.get(longTimeNoSee) != null) {
                    member.add(longTimeNoSee);
                }
            }

            member.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

            sb.append(member.size()).append('\n');

            for(String name: member) {
                sb.append(name).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
