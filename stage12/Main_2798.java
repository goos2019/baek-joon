package stage12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * [블랙잭]
 * 1. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임
 * 2. 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
 * 3. 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 * 4. N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력
 * [입력]
 * 1. 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)
 * 2. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
 * 3. 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
 * [출력]
 * 1.첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력
 */
public class Main_2798 {
    public static void main(String[] args) {

        // n개 중 중복되지 않는 경우를 찾아서 최대 수를 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] firstLine = br.readLine().split(" ");
            int N = Integer.parseInt(firstLine[0]);
            int M = Integer.parseInt(firstLine[1]);

            String[] secondLine = br.readLine().split(" ");
            ArrayList<Integer> deck = new ArrayList<Integer>();

            for(int i = 0; i < secondLine.length; i++) {
                deck.add(Integer.parseInt(secondLine[i]));
            }

            int max = 0;

            for(int i = 0; i < (N - 2); i++) {
                for(int j = i + 1; j < (N - 1); j++) {
                    for(int k = j + 1; k < N; k++) {
                        int sum = deck.get(i) + deck.get(j) + deck.get(k);
                        if(sum <= M && sum > max) {
                            max = sum;
                        }
                    }
                }
            }

            System.out.println(max);

        } catch(Exception e) {

        }
    }
}
