package stage16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_24511 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");
            Queue<String> queue = new LinkedList<>();

            for(int i = A.length - 1; i >= 0; i--) {
                if(A[i].equals("0")) queue.add(B[i]);
            }

            br.readLine();
            for(String data : br.readLine().split(" ")) {
                queue.add(data);
                sb.append(queue.poll()).append(" ");
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}