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
            String[] list = new String[N + 1];
            Map<String, Integer> mapList = new HashMap<>();

            for(int i = 0; i < N; i++) {
                list[i + 1] = br.readLine();
                mapList.put(list[i + 1], i + 1);
            }

            for(int i = 0; i < M; i++) {
                String data = br.readLine();
                if((int)data.charAt(0) >= 65) {
                    sb.append(mapList.get(data)).append('\n');
                } else {
                    sb.append(list[Integer.parseInt(data)]).append('\n');
                }
            }

            System.out.println(sb);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
