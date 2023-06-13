package under6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main_1316
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            int total = count;
            ArrayList<String> list;

            for(int i = 0; i < count; i++)
            {
                String rl = br.readLine();
                String[] values = rl.split("");
                list = new ArrayList<String>();
                String temp = values[0];
                list.add(temp);

                for(int j = 1; j < values.length; j++)
                {
                    // 리스트에 값이 있고 이전 값이 현재 값과 다르다면
                    if(list.contains(values[j]) && !temp.equals(values[j])) 
                    {
                        total -= 1;
                        break;
                    }
                    else
                    {
                        list.add(values[j]);
                        temp = values[j];
                    }
                }
            }

            System.out.println(total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}