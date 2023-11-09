package stage14;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main_1620 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            String[] dogam = new String[N];
            Map<String, Integer> dogamMap = new HashMap<String, Integer>();
            for (int i = 0; i < dogam.length; i++) {
                dogam[i] = br.readLine();
                dogamMap.put(dogam[i], i);
            }
            while(M-->0) {
                String str = br.readLine();
                if((int)str.charAt(0)>=65) {
                    //문자
                    sb.append(dogamMap.get(str)+1).append("\n");
                }else {
                    //숫자
                    int idx = Integer.parseInt(str);
                    sb.append(dogam[idx-1]).append("\n");
                }
            }
            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
