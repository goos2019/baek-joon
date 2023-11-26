package stage21;

import java.io.*;

public class Main_24060 {

    static int[] A;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NK = br.readLine().split(" ");
            String[] data = br.readLine().split(" ");
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
            A = new int[N];

            for(int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(data[i]);
            }

            merge_sort(0, N - 1);

            for(int value : A) {
                System.out.println(value);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void merge_sort(int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;
            merge_sort(p, q);
            merge_sort(q + 1, r);
            merge(p, q, r);
        }
    }

    static void merge(int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        int[] tmp = new int[A.length + 1];
        while(i <= q && j < r) {
            if(A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        while(i <= q) {
            tmp[t++] = A[i++];
        }
        while(j <= r) {
            tmp[t++] = A[j++];
            i = p;
            t = 1;
        }
        while(i <= r) {
            A[i++] = tmp[t++];
        }
    }
}