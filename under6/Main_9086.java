package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9086 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int T = Integer.parseInt(br.readLine());
            for(int i = 0; i < T; i++) {
                String[] data = br.readLine().split("");
                sb.append(data[0]).append(data[data.length - 1]).append("\n");
            }
            System.out.println(sb);
        } catch(Exception e) {
        }
    }
}
