package stage15;

import java.io.*;
import java.util.*;

public class Main_4134 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            long target;
            long value;

            for(int i = 0; i < count; i++) {

                value = Long.parseLong(br.readLine());
                target = search(value);
                sb.append(target).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static long search(long value) {

        if(value == 0 || value == 1) {
            return 2;
        }

        while(true) {

            boolean flag = true;

            for(long j = 2; j <= Math.sqrt(value); j++) {
                if(value%j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag == true) break;
            ++value;
        }

        return value;
    }
}