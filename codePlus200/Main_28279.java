package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main_28279 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        try {

            int count = Integer.parseInt(br.readLine());

            for(int i = 0; i < count; i++) {

                String[] data = br.readLine().split(" ");
                int order = Integer.parseInt(data[0]);

                switch (order) {
                    case 1: deque.addFirst(Integer.parseInt(data[1])); break;
                    case 2: deque.addLast(Integer.parseInt(data[1])); break;
                    case 3:
                        if (deque.peek() != null) {
                            sb.append(deque.poll()).append('\n');
                        } else {
                            sb.append(-1).append('\n');
                        }
                        break;
                    case 4:
                        if (deque.peek() != null) {
                            sb.append(deque.pollLast()).append('\n');
                        } else {
                            sb.append(-1).append('\n');
                        }
                        break;
                    case 5: sb.append(deque.size()).append('\n'); break;
                    case 6:
                        if (deque.isEmpty()) {
                            sb.append(1).append('\n');
                        } else {
                            sb.append(0).append('\n');
                        }
                        break;
                    case 7:
                        if (deque.peek() != null) {
                            sb.append(deque.getFirst()).append('\n');
                        } else {
                            sb.append(-1).append('\n');
                        }
                        break;
                    case 8:
                        if (deque.peek() != null) {
                            sb.append(deque.getLast()).append('\n');
                        } else {
                            sb.append(-1).append('\n');
                        }
                        break;
                }
            }

            System.out.println(sb.toString());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
