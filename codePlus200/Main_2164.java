package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_2164 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int max = Integer.parseInt(br.readLine());
            LinkedList<Integer> ll = new LinkedList<>();

            for(int i = 1; i <= max; i++) {
                ll.add(i);
            }

            int count = 0;

            while(ll.size() != 1) {
                if(count%2 == 0) {
                    ll.removeFirst();
                } else if(count%2 == 1) {
                    ll.addLast(ll.poll());
                }
                count++;
            }

            System.out.println(ll.poll());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}