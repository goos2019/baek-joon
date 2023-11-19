package stage19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_24723 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long N = Integer.parseInt(br.readLine());
            System.out.println((int)Math.pow(2, N));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
