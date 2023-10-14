package stage12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * [분해합]
 * 1. 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미
 * 2. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자
 * [입력]
 * 1. 첫째 줄에 자연수 N(1 ≤ N ≤ 1000000)과 M(10 ≤ M ≤ 300,000)
 * [출력]
 * 1.첫째 줄에 답을 출력 생성자가 없는 경우 0을 출력숫자
 */
public class Main_2231 {
    public static void main(String[] args) {

        // n개 중 중복되지 않는 경우를 찾아서 최대 수를 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            // 각 자리수의 합이므로 9 * 자리수가 최대 값
            // 실제 수 - 자리수 * 9 부터 시작
            // mod로 각 자리수를 추출해서 생성자를 계산
            
            String read = br.readLine();
            int N = Integer.parseInt(read);
            int digit = read.length();
            int low = 0;

            for(int i = N - (digit * 9); i <= N; i++) {

                int temp = i;
                int sum = temp;

                while(true) {

                    if(temp == 0) break;
                    sum += temp%10; // 189 + 9
                    temp /= 10;
                }

                if(sum == N) {
                    low = i;
                    break;
                }
            }

            System.out.println(low);

        } catch(Exception e) {

        }
    }
}
