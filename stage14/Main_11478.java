package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_11478 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] data = br.readLine().split("");
            Set<String> list = new HashSet<>();

            for(int i = 0; i < data.length; i++) {

                int start = 0;
                int last = start + i;

                while(last < data.length) {

                    StringBuilder str = new StringBuilder();

                    for(int s = start; s <= last; s++) {
                        str.append(data[s]);
                    }

                    list.add(str.toString());
                    start++;
                    last++;
                }
            }

            System.out.println(list.size());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
