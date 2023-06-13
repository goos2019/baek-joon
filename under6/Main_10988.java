package under6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main_10988
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = br.readLine();
            String[] array = line.split("");
            int max = line.length()/2;
            int ck = 1;

            for (int i = 0; i < max; i++)
            {
                if (!array[i].equals(array[line.length() - i - 1])) 
                {
                    ck = 0;
                }
            }

            System.out.println(ck);;
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}