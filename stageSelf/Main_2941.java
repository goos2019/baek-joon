package stageSelf;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * [크로아티아 알파벳]
 * 1. 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 * 2. 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * č	c=
 * ć	c-
 * dž	dz=
 * đ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 * 3. dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 * [입력]
 * 1. 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 * [출력]
 * 1. 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
 */
public class Main_2941 {
    
    // -, =이 들어가면 무조건 1개
    // dz=와 z=는 크로아티아 알파벳이 2개인지 1개인지 확인이 필요
    // j가 들어가면 앞이 l또는 n으로 시작하는지 확인
    // c [=, -]
    // z [=]
    // s [=]
    // d [-]
    // l, n [j]
    // 1. -, =, j를 확인
    // 2. 앞의 알파벳을 확인하여 c, z, l, n, s, z가 나오는지 확인해서 나오면 크로아티아 알파벳 수 1증가

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] data = br.readLine().split("");
            int count = 0;
            int totalCount = 0;

            for(int i = 0; i < data.length; i++) {

                if(data[i].equals("-")) {
                    if(i-1 >= 0 && (data[i-1].equals("d") || data[i-1].equals("c"))) {
                        count += 2;
                        totalCount++;
                    }
                }
                if(data[i].equals("=")) {
                    if(i-1 >= 0 && (data[i-1].equals("z") || data[i-1].equals("s") || data[i-1].equals("c"))) {
                        count += 2;
                        totalCount++;
                        if(i-2 >= 0 && data[i-1].equals("z") && data[i-2].equals("d")) {
                            count++;
                        }
                    }
                }
                if(data[i].equals("j")) {
                    if(i-1 >= 0 && (data[i-1].equals("l") || data[i-1].equals("n"))) {
                        count += 2;
                        totalCount++;
                    }
                }
            }

            System.out.println((data.length - count) + totalCount);

        } catch(Exception e) {

        }
    }
}
