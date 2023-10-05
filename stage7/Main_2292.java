package stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [벌집]
 * 1. 중앙의 방 1부터 시작
 * 2. 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 가짐
 * 3. 숫자 n이 주어졌을때 중앙(1)에서 n번 방까지 최소 개수의 방을 지나갈 때 몇개의 방을 지나가는지 계산하는 프로그램을 작성하라
 *
 * <input>
 *     n(1<=n<=100000000)
 * <output>
 *     방의 수
 */

public class Main_2292 {

    public static void main(String[] args) {

        // 어디에 있든지 현재 속하는 그룹에 따라서 똑같은 이동 거리를 가짐 (방의수 = 이동 거리 + 1)
        // ex) 2번 그룹인 2~7은 1번  5
        //     3번 그룹인 8~19는 2번 11 6
        //     4번 그룹인 20~37은 3번 17 6
        //     5번 그룹인 38~61은 4번 23 6
        // 각 그룹은 2 + (6*1 + ... + 6*n) ~ [2 + (6*1 + ... + 6*n)] + 6*n + 5
        // 3n^2 + 3n + 2 ~ 3n^2 + 9n + 7 => n

        // 등차수열의 합
        // 1 + ... 10 => 55
        // 1 + 2 => 3
        // 1 + 2 + 3 => 6
        // n(n + 1)/2

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            int num = Integer.parseInt(br.readLine());

            // 방수를 저장한 변수
            int room = 0;

            if(num == 1) {
                System.out.println(1);
            } else {
                while(true) {

                    int min = (3 * room * room) + (3 * room) + 2;
                    int max = (3 * room * room) + (9 * room) + 7;

                    room += 1;

                    if (room == 4){
                        System.out.println("================[" + room + "]================");
                        System.out.println(min + "~" + max);
                    }

                    if(num >= min && num <= max) {
                        room += 1;
                        break;
                    }
                }

                System.out.println(room);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
