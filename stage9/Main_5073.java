package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5073 {

    public static void main(String[] args) {

        // 삼각형 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true) {

                String[] dataSet = br.readLine().split(" ");
                int a = Integer.parseInt(dataSet[0]);
                int b = Integer.parseInt(dataSet[1]);
                int c = Integer.parseInt(dataSet[2]);

                if(a + b + c == 0) break;

                int max = a;
                int sum = b + c;
                if(max < b) {
                    max = b;
                    sum = a + c;
                }
                if(max < c) {
                    max = c;
                    sum = a + b;
                }

                if(sum <= max && a != 0 && b != 0 && c != 0) {
                    System.out.println("Invalid");
                } else {
                    if(a == b && b == c) {
                        System.out.println("Equilateral");
                    } else if(a == b || a == c || b == c) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Scalene");
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
