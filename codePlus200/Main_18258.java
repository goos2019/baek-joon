package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main_18258 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int count = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            Queue<Integer> que = new LinkedList<>();
            int last = 0;

            for(int i = 0; i < count; i++) {

                String[] command = br.readLine().split(" ");

                switch(command[0]) {

                    case "push":
                        que.offer(Integer.parseInt(command[1]));
                        last = Integer.parseInt(command[1]);
                        break;

                    case "pop":
                        if(que.peek() == null) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(que.poll()).append('\n');
                        }
                        break;

                    case "size":
                        sb.append(que.size()).append('\n');
                        break;

                    case "empty":
                        if(que.isEmpty()) {
                            sb.append(1).append('\n');
                        } else {
                            sb.append(0).append('\n');
                        }
                        break;

                    case "front":
                        if(que.peek() == null) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(que.peek()).append('\n');
                        }
                        break;

                    case "back":
                        if(que.peek() == null) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(last).append('\n');
                        }
                        break;
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
