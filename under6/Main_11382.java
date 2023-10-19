package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11382 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] data = br.readLine().split(" ");
            System.out.println(Long.parseLong(data[0]) + Long.parseLong(data[1]) + Long.parseLong(data[2]));
        } catch(Exception e) {

        }
    }
}
