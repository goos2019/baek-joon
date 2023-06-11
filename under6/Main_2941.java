package under6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main_2941{
	public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpb = br.readLine();
        String[] array = alpb.split("");
        int len = alpb.length();
        int ck = 0;
        
        for (int i = (len - 1); i >= 0; --i)
        {
            if (array[i].equals("-") || array[i].equals("="))
            {
                if (ck == 2)
                {
                    len -= 1;
                }
                ck = 1;
            }
            else if (array[i].equals("j")) 
            {
                if (ck == 2)
                {
                    len -= 1;
                }
                ck = 3;
            }
            else if (ck == 3) 
            {
                ck = 0;
                
                if (array[i].equals("l") || array[i].equals("n"))
                {
                    len -= 1;
                }
            }
            else if (ck == 1)
            {   
                if (array[i].equals("c") || array[i].equals("s"))
                {
                    len -= 1;
                    ck = 0;
                }
                else if (array[i].equals("z"))
                {
                    ck = 2;
                }
                else
                {
                    ck = 0;
                }
            }
            else if (ck == 2)
            {
                
                if (array[i].equals("d"))
                {
                    len -= 2;
                }
                else
                {
                    len -= 1;
                }
                ck = 0;
            }
        }
    }
}