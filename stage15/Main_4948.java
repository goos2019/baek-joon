package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4948 {

    static int MAX = 250000;
    static boolean[] che = new boolean[MAX + 1];

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            funcChe();
            while(true) {
                int value = Integer.parseInt(br.readLine());
                if(value == 0) break;

                int count = 0;
                for(int i = value + 1; i <= value*2; i++) {
                    if(!che[i]) ++count;
                }
                System.out.println(count);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void funcChe() {
        che[1] = true;
        for(int i = 2; i <= Math.sqrt(MAX); i++) {
            for(int j = 2; i*j <= MAX; j++) {
                if(!che[i*j]) che[i*j] = true;
            }
        }
    }
}
