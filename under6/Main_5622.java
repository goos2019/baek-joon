package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main_5622 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            char[] data = br.readLine().toCharArray();
            int time = 0;
            for(int number : data) {
                time += 1;
                if(number <= 67) {
                    time += 2;
                } else if(number <= 70) {
                    time += 3;
                } else if(number <= 73) {
                    time += 4;
                } else if(number <= 76) {
                    time += 5;
                } else if(number <= 79) {
                    time += 6;
                } else if(number <= 83) {
                    time += 7;
                } else if(number <= 86) {
                    time += 8;
                } else {
                    time += 9;
                }
            }

            System.out.println(time);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
