package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10101 {

    public static void main(String[] args) {

        // 삼각형 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tri = new int[3];

        try {
            for(int i = 0; i < 3; i++) {
                tri[i] = Integer.parseInt(br.readLine());
            }

            if(tri[0] + tri[1] + tri[2] != 180) {
                System.out.println("Error");
            } else if(tri[0] == tri[1]) {
                if(tri[1] == tri[2]) {
                    System.out.println("Equilateral");
                } else {
                    System.out.println("Isosceles");
                }
            } else {
                if(tri[1] == tri[2] || tri[0] == tri[2]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        } catch (Exception e) {

        }
    }
}
