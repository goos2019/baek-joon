package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1269 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] AB = br.readLine().split(" ");
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);
            String[] aData = br.readLine().split(" ");
            String[] bData = br.readLine().split(" ");

            int count = 0;

            for(String a :aData) {
                for(String b :bData) {
                    if(a.equals(b)) {
                        ++count;
                    }
                }
            }

            System.out.println(aData.length + bData.length - (count * 2));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
