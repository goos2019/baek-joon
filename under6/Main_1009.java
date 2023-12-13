package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1009 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++) {
                String[] ab = br.readLine().split(" ");
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
                System.out.println(test(a, b));
            }
        } catch(Exception e) {

        }
    }

    static int test(int a, int b) {
        double number = 1;
        for(int i = 0; i < b; i++) {
            number = (number*a)%10;
        }
        if(number == 0) {
            number = 10;
        }
        return (int)number;
    }
}
