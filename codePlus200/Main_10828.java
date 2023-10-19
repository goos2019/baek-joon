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

                    int[] temp = new int[top + 1];

                    if(top != 0) {
                        for(int j = 0; j < top; j++) {
                            temp[j] = stack[j];
                        }
                        temp[top] = Integer.parseInt(data[1]);
                    } else {
                        temp[0] = Integer.parseInt(data[1]);
                    }

                    stack = temp;
                    top += 1;

                } else if(data[0].equals("pop")) {

                    if(top <= 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[top - 1]);

                        top -= 1;

                        int[] temp = new int[top];

                        for(int j = 0; j < top; j++) {
                            temp[j] = stack[j];
                        }

                        stack = temp;
                    }

                } else if(data[0].equals("size")) {

                    System.out.println(stack.length);

                } else if(data[0].equals("empty")) {

                    if(top <= 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if(data[0].equals("top")) {

                    if(top <= 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[top - 1]);
                    }

                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
