package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_14425 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            Set<String> list = new HashSet<>();

            for(int i = 0; i < N; i++) {
                list.add(br.readLine());
            }

            int count = 0;
            for(int i = 0; i < M; i++) {
                if(list.contains(br.readLine())) {
                    count++;
                }
            }

            System.out.println(count);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
