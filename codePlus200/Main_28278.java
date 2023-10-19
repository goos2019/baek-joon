package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_28278 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int repeat = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < repeat; i++) {
                String[] data = br.readLine().split(" ");

                if(data[0].equals("1")) {
                    stack.push(Integer.parseInt(data[1]));
                } else if(data[0].equals("2")) {
                    if(stack.empty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.peek()).append('\n');
                        stack.pop();
                    }
                } else if(data[0].equals("3")) {
                    sb.append(stack.size()).append('\n');
                } else if(data[0].equals("4")) {
                    if(stack.empty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                } else if(data[0].equals("5")) {
                    if(stack.empty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.peek()).append('\n');
                    }
                }
            }
            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}