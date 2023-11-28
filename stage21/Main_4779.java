package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4779 {

    static int[] tmp;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {

            while(true) {
                String line = br.readLine();
                if(line.isEmpty()) break;
                int data = Integer.parseInt(line);
                int N = (int)Math.pow(3, data);
                tmp = new int[N];
                fac(0, N);
                for(int i : tmp) {
                    if(i == 1) sb.append(" ");
                    else sb.append("-");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void fac(int start, int size) {
        if(size == 1) return;
        for(int i = start + (size/3); i < start + ((size/3)*2); i++) {
            tmp[i] = 1;
        }
        fac(start, size/3);
        fac(start + ((size/3)*2), size/3);
    }
}
