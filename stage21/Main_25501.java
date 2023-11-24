package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_25501 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i < T; i++) {
                String[] data = br.readLine().split("");
                int[] result = recursion(data, 0, data.length - 1);
                sb.append(result[0]).append(" ").append(result[1]).append('\n');
            }

            System.out.println(sb);
        } catch(Exception e) {

        }
    }

    static int[] recursion(String[] data, int left, int right) {
        if(left >= right) {
            return new int[]{1, ++left};
        } else if(!data[left].equals(data[right])) {
            return new int[]{0, ++left};
        } else {
            return recursion(data, ++left, --right);
        }
    }
}