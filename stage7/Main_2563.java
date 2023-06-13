package stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2563 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[100][100];
        int total = 0;

        try {
            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {

                String[] line = br.readLine().split(" ");

                int targetX = Integer.parseInt(line[0]);
                int targetY = Integer.parseInt(line[1]);

                for (int x = targetX; x < (targetX + 10); x++) {
                    for (int y = targetY; y < (targetY + 10); y++) {
                        if(matrix[x - 1][y - 1] == 0) {
                            matrix[x - 1][y - 1] = 1;
                            total += 1;
                        }
                    }
                }
            }

            System.out.println(total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
