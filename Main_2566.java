import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main_2566 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, targetX = 0, targetY = 0;

        try {
            for(int x = 0; x < 9; x++) {

                String[] line = br.readLine().split(" ");

                for(int y = 0; y < 9; y++) {
                    int value = Integer.parseInt(line[y]);
                    
                    if(value >= max) {
                        max = value;
                        targetX = x + 1;
                        targetY = y + 1;
                    }
                }
            }

            System.out.println(max);
            System.out.printf("%d %d%n", targetX, targetY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}