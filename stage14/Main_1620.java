package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Main_1620 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            ArrayList<String> list = new ArrayList<>();
            Map<String, Integer> mapList = new HashMap<>();
            Pattern pattern = Pattern.compile("[0-9]+");

            for(int i = 0; i < N; i++) {
                String data = br.readLine();
                list.add(data);
                mapList.put(data, i + 1);
            }

            for(int i = 0; i < M; i++) {
                String data = br.readLine();

                if(pattern.matcher(data).matches()) {
                    sb.append(list.get(Integer.parseInt(data) - 1)).append('\n');
                } else {
                    sb.append(mapList.get(data)).append('\n');
                }
            }

            System.out.println(sb);

//            Pattern pattern = Pattern.compile("[0-9]+");
//            while(true) {
//                String data = br.readLine();
//                Matcher matcher = pattern.matcher(data);
//
//                System.out.println(matcher.matches());
//                while (matcher.find()) {
//                    System.out.println("찾음");
//                }
//                System.out.println(Pattern.matches("[0-9]+", "123456"));
//            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
