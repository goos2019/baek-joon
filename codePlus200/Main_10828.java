package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10828 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int repeat = Integer.parseInt(br.readLine());
            int[] stack = new int[0];
            int top = 0;

            for(int i = 0; i < repeat; i++) {
                String[] data = br.readLine().split(" ");

                if(data[0].equals("push")) {

                    top += 1;
                    int[] temp = new int[top];

                    for(int j = 0; j < top; j++) {
                        temp[j] = stack[j];
                    }

                    temp[top] = Integer.parseInt(data[1]);
                } else if(data[0].equals("pop")) {



                    if(top - 1 <= 0) {
                        System.out.println(-1);
                    }

                } else if(data[0].equals("size")) {

                } else if(data[0].equals("empty")) {

                } else if(data[0].equals("top")) {

                }
            }
        } catch(Exception e) {
        }
    }
}
