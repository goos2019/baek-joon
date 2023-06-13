package under6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_25206
{
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            double sum = 0.0;
            double scoreGrade = 0.0;

            for(int i = 0; i < 20; i++)
            {
                String[] classInfo = br.readLine().split(" ");
                
                double score = Double.parseDouble(classInfo[1]);
                double grade = 0.0;

                switch(classInfo[2])
                {
                    case "A+": grade = 4.5; break;
                    case "A0": grade = 4.0; break;
                    case "B+": grade = 3.5; break;
                    case "B0": grade = 3.0; break;
                    case "C+": grade = 2.5; break;
                    case "C0": grade = 2.0; break;
                    case "D+": grade = 1.5; break;
                    case "D0": grade = 1.0; break;
                    default: continue;
                }

                sum += score;
                scoreGrade += score * grade;
            }

            System.out.printf("%.4f%n", scoreGrade / sum);
        } 
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
