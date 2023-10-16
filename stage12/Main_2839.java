package stage12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [설탕 배달]
 * 1. 사탕가게에 설탕을 정확하게 N킬로그램을 배달
 * 2. 봉지는 3킬로그램 봉지와 5킬로그램 봉지
 * 3. 최대한 적은 봉지를 들고 가려고 한다
 * [입력]
 * 1. 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
 * [출력]
 * 1. 배달하는 봉지의 최소 개수를 출력
 * 2. 정확하게 N킬로그램을 만들 수 없다면 -1을 출력
 */
public class Main_2839 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            // 2중 for문으로 5kg, 3kg을 돌림
            // 0, 1, 2, ... , 5kg 증가  
            // 0, 1, 2, ... , 3kg 증가
            // 각 최대 증가량은 N/kg으로 해서 올림 처리
            // N에서 해당 봉지의 kg을 곱해주고 0이 되면 2중 for문의 각for문의 현재 반복 count끼리 더함

            int N = Integer.parseInt(br.readLine());
            int max3 = N/3 + 1;
            int max5 = N/5 + 1;
            int count = -1;

            for(int i = 0; i < max5; i++) {
                for(int j = 0; j < max3; j++) {

                    int sum = N - (j*3) - (i*5);
                    int bag = i + j;
                    if(count == -1 && sum == 0) {
                        count = bag;
                    } else if (count != -1 && sum == 0 && bag < count) {
                        count = bag;
                    }
                }
            }

            System.out.println(count);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

