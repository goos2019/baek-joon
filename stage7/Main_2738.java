import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2738 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = br.readLine().split(" ");

            int X = Integer.parseInt(line[0]);
            int Y = Integer.parseInt(line[1]);

            int[][] XY = new int[X][Y];

            for(int t = 0; t < 2; t++) {
                for(int i = 0; i < X; i++) {

                    String[] temp = br.readLine().split(" ");

                    for(int j = 0; j < Y; j++) {
                        XY[i][j] += Integer.parseInt(temp[j]);
                    }
                }
            }
                
            for(int i = 0; i < X; i++) {
                for(int j = 0; j < Y; j++) {
                    System.out.print(XY[i][j] + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }    
}
