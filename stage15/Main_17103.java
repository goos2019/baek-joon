package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_17103 {

    static boolean[] prime;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int testCase = Integer.parseInt(br.readLine());
            int[] caseArray = new int[testCase];

            int max = 0;
            for(int i = 0; i < testCase; i++) {
                int data = Integer.parseInt(br.readLine());
                if(data > max) max = data;
                caseArray[i] = data;
            }

            prime = getPrime(max);

            for(int value: caseArray) {
                sb.append(getGold(value)).append('\n');
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static boolean[] getPrime(int max) {
        boolean[] prime = new boolean[max];
        prime[1] = true;
        for(int i = 2; i < Math.sqrt(max); i++) {
            for(int j = 2; i*j < max; j++) {
                if(!prime[i*j]) prime[i*j] = true;
            }
        }
        return prime;
    }

    static int getGold(int value) {

        int count = 0;

        ArrayList<Integer> primeList = new ArrayList<>();

        for(int i = 2; i < value; i++) {
            if(!prime[i]) primeList.add(i);
        }

        for(int firstN : primeList) {
            if((firstN*2) > value) continue;
            for(int secondN : primeList) {
                if((firstN + secondN) > value) {
                    break;
                } else if((firstN + secondN) == value) {
                    ++count;
                }
            }
        }

        return count;
    }
}
