package stage15;

import java.io.*;
import java.util.*;

public class Main_4134 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            int max = 0;
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            for(int i = 0; i < count; i++) {
                int value = Integer.parseInt(br.readLine());
                if(value > max) {
                    max = value;
                }
                list.add(value);
            }

            list2.add(1);
            list2.add(2);
            list2.add(3);

            for(int i = 4; i <= max; i++) {

                boolean flag = true;

                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i%j == 0) {
                        flag = false;
                        break;
                    }
                }

                if(flag == true) list2.add(i);
            }

            int maxCount = max;

            while(true) {

                ++maxCount;

                boolean flag = true;

                for(int i = 2; i <= Math.sqrt(maxCount); i++) {
                    if(maxCount%i == 0) {
                        flag = false;
                        break;
                    }
                }

                if(flag == true) break;
            }


            for(int value: list) {
                int after = 400000000;
                for(int target :list2) {
                    int afterDist = Math.abs(after - value);
                    int beforeDist = Math.abs(target - value);
                    if(afterDist > beforeDist) {
                        after = target;
                    } else {
                        sb.append(after).append('\n');
                        break;
                    }
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
