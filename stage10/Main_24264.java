package stage10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [알고리즘 수업 - 알고리즘의 수행 시간 1]
 * 1. 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력
 *  MenOfPassion(A[], n) {
 *      i = ⌊n / 2⌋;
 *      return A[i]; # 코드1
 *  }
 *  [입력]
 *  1. 수행 횟수인 n을 입력
 *  [출력]
 *  1. 수행 횟수를 출력
 *  2. 수행 횟수를 다항식으로 나타냈을때 최고차항의 차수를 출력 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력.
 */

public class Main_24264 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // MenOfPassion는 이중 for문으로 인해 입력 값에 제곱만큼 진행
            // 복잡도는 n^2이므로 2차항이며 최고차항의 차수는 2
            long n = Long.parseLong(br.readLine());

//            int[] A = new int[n];
//            int sum = 0;
//
//            Main_24264 m = new Main_24264();
//            sum = m.MenOfPassion(A, n);

            System.out.println(n * n);
            System.out.println(1);

        } catch(Exception e) {

        }
    }

//    int MenOfPassion(int A[], int n) {
//        int sum = 0;
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                sum += A[i] + A[j];
//            }
//
//        }
//        return sum;
//    }
}
