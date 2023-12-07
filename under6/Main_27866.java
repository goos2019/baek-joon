package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_27866 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] sentence = br.readLine().split("");
            int number = Integer.parseInt(br.readLine()) - 1;
            System.out.println(sentence[number]);
        } catch(Exception e) {

        }
    }
}