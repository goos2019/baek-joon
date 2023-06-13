package stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2745 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = br.readLine().split(" ");
            String[] value = line[0].split("");
            int radix = Integer.parseInt(line[1]);
            int sum = 0;

            for(int i = 0; i < value.length; i++) {

                int exp = value.length - (i + 1);
                int base = (int)Math.pow(radix, exp) ;
                int topping = 0;
                
                char temp = value[i].charAt(0);

                if(temp - 48 < 10) {
                    topping = temp - 48;
                }else{
                    topping = temp - 55;
                }

                sum += base * topping;
            }

            System.out.println(sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
