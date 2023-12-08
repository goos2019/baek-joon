package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1152 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String sentence = br.readLine().strip();
            int count = 0;
            if(!sentence.isEmpty()) {
                count = sentence.split(" ").length;
            }
            System.out.println(count);
        } catch(Exception e) {
        }
    }
}
