package stage14;

import java.io.*;
import java.util.*;

public class Main_10815 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            String[] getSang = br.readLine().split(" ");
            Set<Integer> list = new HashSet<>();

            for(int i = 0; i < N; i++) {
                list.add(Integer.parseInt(getSang[i]));
            }

            int M = Integer.parseInt(br.readLine());
            String[] getSample = br.readLine().split(" ");

            for(int i = 0; i < M; i++) {
                if(list.contains(Integer.parseInt(getSample[i]))) {
                    sb.append(1).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
