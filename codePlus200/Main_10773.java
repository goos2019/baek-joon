package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            long sum = 0;
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < count; i++) {
                int data = Integer.parseInt(br.readLine());
                if(data == 0) {
                    sum -= stack.pop();
                } else {
                    sum += data;
                    stack.push(data);
                }
            }

            System.out.println(sum);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}