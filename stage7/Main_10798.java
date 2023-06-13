package stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_10798{
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lst = new ArrayList<String>();

        try {
            for(int x = 0; x < 5; x++) {

                String[] line = br.readLine().split("");

                for(int y = 0; y < line.length; y++) {
                    if(lst.size() < (y + 1)) {
                        lst.add(line[y]);
                    }else{
                        lst.set(y, lst.get(y) + line[y]);
                    }
                }
            }

            for(String str: lst) {
                System.out.print(str);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}