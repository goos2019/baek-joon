package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_25314 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int byteInteger = Integer.parseInt(br.readLine());

            for(int i = 0; i < (byteInteger/4); i++) {
                sb.append("long ");
            }
            sb.append("int");
            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
