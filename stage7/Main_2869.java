package stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [달팽이는 올라가고 싶다]
 * 1. 달팽이는 높이가 V인 나무 막대를 올라감
 * 2. 낮에 A미터 올라감
 * 3. 밤에 B미터 미끄러짐
 * 4. 정상에 올라가면 미끄러지지 않음
 * 5. 달팽이가 나무에 올라가려면 몇일이 걸리는지 구하시오
 */
public class Main_2869 {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            String[] value = br.readLine().split(" ");
            int A = Integer.parseInt(value[0]);
            int B = Integer.parseInt(value[1]);
            int V = Integer.parseInt(value[2]);

            int day = (V - B) / (A - B);

            if((V - B)%(A - B) != 0) {
                ++day;
            }

            System.out.println(day);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
