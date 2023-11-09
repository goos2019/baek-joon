package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_10816 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");
            Map<String, Integer> ownCard = new HashMap<>();

            for(String cardName: data) {
                if(ownCard.get(cardName) != null) {
                    ownCard.put(cardName, ownCard.get(cardName) + 1);
                } else {
                    ownCard.put(cardName, 1);
                }
            }

            int M = Integer.parseInt(br.readLine());
            String[] sample = br.readLine().split(" ");

            for(int i = 0; i < M; i++) {
                String sampleName = sample[i];
                if(ownCard.get(sampleName) != null) {
                    sb.append(ownCard.get(sampleName)).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
