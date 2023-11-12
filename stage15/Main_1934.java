package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1934 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());

            for(int i = 0; i < count; i++) {
                String[] line = br.readLine().split(" ");

                int highCoef = Math.max(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                int lowCoef = Math.min(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                int A = highCoef;
                int B = lowCoef;

                while(true) {
                    B += lowCoef;
                    if(B%A == 0) {
                        break;
                    } else if(B > A) {
                        A += highCoef;
                    }
                }

                sb.append(B).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
