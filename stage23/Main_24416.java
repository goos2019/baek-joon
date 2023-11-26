package stage23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_24416 {

    static int[] f;
    static int fibCount = 1;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            f = new int[n];

            fib(n);
            int fibonacciCount = fibonacci(n);

            System.out.println(fibCount + " " + fibonacciCount);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static int fib(int n) {
        if(n == 1 || n == 2) return 1;
        else {
            ++fibCount;
            return fib(n - 1) + fib(n - 2);
        }

    }

    static int fibonacci(int n) {
        f[0] = 1;
        f[1] = 1;
        int count = 0;
        for(int i = 2; i < n; i++) {
            count++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return count;
    }
}
