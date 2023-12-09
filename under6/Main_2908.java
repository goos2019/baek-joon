package under6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2908 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] AB = br.readLine().split(" ");
            String[] A = AB[0].split("");
            String[] B = AB[1].split("");
            for(int i = A.length - 1;i >= 0; i--) {
                if(Integer.parseInt(A[i]) > Integer.parseInt(B[i])) {
                    System.out.println(A[2] + A[1] + A[0]);
                    break;
                } else if(Integer.parseInt(A[i]) < Integer.parseInt(B[i])) {
                    System.out.println(B[2] + B[1] + B[0]);
                    break;
                }
            }
        } catch(Exception e) {

        }
    }
}
