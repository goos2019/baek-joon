package stage20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_25192 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            int gomgom = 0;
            Set<String> set = new HashSet<String>();

            for(int i = 0; i < count; i++) {
                String name = br.readLine();

                if(name.equals("ENTER")) {
                    set.clear();
                } else if(!set.contains(name)) {
                    gomgom++;
                    set.add(name);
                }
            }

            System.out.println(gomgom);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
