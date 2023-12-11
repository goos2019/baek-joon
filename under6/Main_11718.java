package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11718 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String data;
            while((data = br.readLine()) != null) {
               System.out.println(data);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
