package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10828 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int repeat = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < repeat; i++) {
                String[] data = br.readLine().split(" ");

                if(data[0].equals("push")) {
                    stack.push(Integer.parseInt(data[1]));
                } else if(data[0].equals("pop")) {
                    if(stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                        stack.pop();
                    }
                } else if(data[0].equals("size")) {
                    System.out.println(stack.size());
                } else if(data[0].equals("empty")) {
                    if(stack.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if(data[0].equals("top")) {
                    if(stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
