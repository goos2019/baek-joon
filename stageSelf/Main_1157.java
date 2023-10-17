package stageSelf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * [단어 공부]
 * 1. 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성
 * 2. 대문자와 소문자를 구분하지 않는다.
 * [입력]
 * 1. 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * [출력]
 * 1. 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력
 * 2. 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
 */
public class Main_1157 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int max = 0;
        String result = "";

        try {
            String[] data = br.readLine().toUpperCase().split("");

            for(int i = 0; i < data.length; i++) {
                if(hm.containsKey(data[i])) {
                    hm.put(data[i], hm.get(data[i]) + 1);
                    if (hm.get(data[i]) > max) {
                        max = hm.get(data[i]);
                        result = data[i];
                    }
                } else {
                    hm.put(data[i], 1);
                    if (hm.get(data[i]) > max) {
                        max = hm.get(data[i]);
                        result = data[i];
                    }
                }
            }

            int count = 0;
            for(String key: hm.keySet()) {
                if(max == hm.get(key)) count++;
            }

            if(count > 1) {
                System.out.println("?");
            } else {
                System.out.println(result);
            }

        } catch(Exception e) {

        }
    }
}