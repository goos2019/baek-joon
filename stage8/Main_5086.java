package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_5086 {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            ArrayList<String> list = new ArrayList<String>();

            while(true) {
                String temp = br.readLine();
                if(temp.equals("0 0")) break;
                list.add(temp);
            }

            for(String set: list) {

                String[] data = set.split(" ");

                int A = Integer.parseInt(data[0]);
                int B = Integer.parseInt(data[1]);

                if(A > B && A%B == 0) {
                    System.out.println("multiple");
                } else if(A < B && B%A == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
