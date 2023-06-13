package under6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main_test {

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
 
            int count = Integer.parseInt(br.readLine());
            int totalLine = getTotalLine(count);
            String[] printStar = new String[totalLine + 1];
            
            for(int lineNumber = 1; lineNumber <= totalLine; lineNumber++) {

                String printLine = "";

                printLine += getSpaceNumber(count, lineNumber);
                printLine += getStarNumber(count, lineNumber);
                    
                printStar[lineNumber] = printLine;
            }

            for(String star: printStar) {
                if(star != null) {
                    System.out.println(star);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int getTotalLine(int count) {

        return 1 + 2 * (count - 1);
    }

    public static String getStarNumber(int count, int line) {

        int starNumber = getTotalLine(count - getAbsNumber(count - line));
        String star = "";

        for(int i = 0; i < starNumber; i++) {

            star += "*";

        }

        return star;
    }

    public static String getSpaceNumber(int count, int line) {

        int spaceNumber = getAbsNumber(count - line);
        String space = "";

        for(int i = 0; i < spaceNumber; i++) {

            space += " ";

        }

        return space;
    }

    public static int getAbsNumber(int value) {

        return (value < 0) ? value *= -1 : value;
    }
}