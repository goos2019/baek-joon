package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_11478 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String data = br.readLine();
            Set<String> list = new HashSet<>();

            for(int i = 0; i < data.length(); i++) {
                for(int j = i + 1; j <= data.length(); j++) {
                    list.add(data.substring(i, j));
                }
            }

            System.out.println(list.size());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
