package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2346 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int count = Integer.parseInt(br.readLine());
            int[] list = new int[count];
            String[] data = br.readLine().split(" ");

            for(int i = 0; i < count; i++) {
                list[i] = Integer.parseInt(data[i]);
            }

            int idx = list[0];
            int position = 0;
            list[0] = 9999;
            sb.append(1).append(" ");

            for(int i = 0; i < (count - 1); i++) {

                if(idx <= 0) {

                    while(idx != 0) {

                        if(position == 0) {
                            position = list.length - 1;
                        } else {
                            position--;
                        }

                        if(list[position] != 9999) {
                            idx++;
                        }
                    }

                    idx = list[position];
                    list[position] = 9999;
                    sb.append(position + 1).append(" ");
                } else {

                    while(idx != 0) {

                        if(position == (list.length - 1)) {
                            position = 0;
                        } else {
                            position++;
                        }

                        if(list[position] != 9999) {
                            idx--;
                        }
                    }

                    idx = list[position];
                    list[position] = 9999;
                    sb.append(position + 1).append(" ");

                }
            }

            System.out.println(sb.toString());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
