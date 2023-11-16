package stage15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_17103 {

    static int MAX = 1000001;
    static ArrayList<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int testCase = Integer.parseInt(br.readLine());
            setPrime();

            for(int i = 0; i < testCase; i++) {
                int data = Integer.parseInt(br.readLine());
                System.out.println(getGold(data));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void setPrime() {
        boolean[] prime = new boolean[MAX];
        prime[1] = true;
        for(int i = 2; i < Math.sqrt(MAX); i++) {
            for(int j = 2; i*j < MAX; j++) {
                if(!prime[i*j]) prime[i*j] = true;
            }
        }

        for(int i = 2; i < MAX; i++) {
            if(!prime[i]) primeList.add(i);
        }

    }

    static int getGold(int value) {

        int count = 0;
        int max = 0;

        for(int i = 0; i < primeList.size(); i++) {
            if(primeList.get(i) > value) {
                max = i;
                break;
            }
        }

        for(int i = 0; i < max; i++) {
            for(int j = max; j >= i; j--) {
                if(primeList.get(i) + primeList.get(j) == value) {
                    count++;
                }
            }
        }

        return count;
    }
}