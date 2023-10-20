package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_18258 {

    public static int[] que;
    public static int back = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int count = Integer.parseInt(br.readLine());
            que = new int[count];

            for(int i = 0; i < count; i++) {

                String[] command = br.readLine().split(" ");

                switch(command[0]) {

                    case "push":
                        push(Integer.parseInt(command[1]));
                        break;

                    case "pop":
                        pop(count);
                        break;

                    case "size":
                        size();
                        break;

                    case "empty":
                        empty();
                        break;

                    case "front":
                        front();
                        break;

                    case "back":
                        back();
                        break;
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void push(int value) {
        que[back] = value;
        ++back;
    }

    public static void pop(int count) {

        if(que[0] == 0) {
//            sb.append(-1).append('\n');
            System.out.println(-1);
        } else {
//            sb.append(que[0]).append('\n');
            System.out.println(que[0]);
            que[0] = 0;
            for(int i = 1; i < back; i++) {
                que[i - 1] = que[i];
                if(i == count) {
                    que[i] = 0;
                }
            }
            --back;
        }
    }

    public static void size() {
//        sb.append(back).append('\n');
        System.out.println(back);
    }

    public static void empty() {
        if(back == 0) {
//            sb.append(1).append('\n');
            System.out.println(1);
        } else {
//            sb.append(0).append('\n');
            System.out.println(0);
        }
    }

    public static void front() {
        if(que[0] == 0) {
//            sb.append(-1).append('\n');
            System.out.println(-1);
        } else {
//            sb.append(que[0]).append('\n');
            System.out.println(que[0]);
        }
    }

    public static void back() {
        if(back == 0) {
//            sb.append(-1).append('\n');
            System.out.println(-1);
        } else {
//            sb.append(que[back - 1]).append('\n');
            System.out.println(que[back - 1]);
        }
    }
}
