package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * [약수들의 합]
 * 1. 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수
 * 2. 입력받은 n이 완전수인지 아닌지 판단하는 프로그램 작성
 *
 * [입력]
 * 1. 입력은 테스트 케이스마다 한 줄 간격으로 n이 주어짐
 * 2. 입력의 마지막엔 -1이 들어감
 */
public class Main_9506 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // -1이 나오기전까지 무한정 반복
            while(true) {
                int n = Integer.parseInt(br.readLine());
                if(n == -1) break;

                // 1. 약수를 파악
                // 2. 약수의 합을 계산
                // 3. 합에 따라 다른 결과물 출력
                int sum = 0;
                ArrayList<Integer> list = new ArrayList<>();

                for(int i = 1; i < n; i++) {
                    if(n%i == 0) {
                        list.add(i);
                        sum += i;
                    }
                }

                if(sum != n) {
                    System.out.println(n + " is NOT perfect.");
                } else {
                    String message = n + " = ";
                    for(int j = 0; j < list.size(); j++) {
                        if(j != (list.size() - 1)) {
                            message += list.get(j) + " + ";
                        } else {
                            message += list.get(j);
                        }
                    }
                    System.out.println(message);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
