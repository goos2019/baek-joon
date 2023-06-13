package under6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main_10812 
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        try 
        {   
            String first_line = br.readLine();
            String[] first_num = first_line.split(" ");

            int lenth_num = Integer.parseInt(first_num[0]);
            int switch_num = Integer.parseInt(first_num[1]);

            String[] switch_options = new String[switch_num];
            int[] basket = new int[lenth_num];

            // input options
            for (int option = 0; option < switch_num; option++ )
            {
                switch_options[option] = br.readLine();
            }

            // input basket
            for (int num = 0; num < lenth_num; num++)
            {
                basket[num] = num + 1;
            }
            
            // switch
            for (int switched = 0; switched < switch_options.length; switched++ )
            {
                String[] options = switch_options[switched].split(" ");
                
                int start = Integer.parseInt(options[0]);
                int end = Integer.parseInt(options[1]);
                int standard = Integer.parseInt(options[2]);

                // temp array
                int temp_len = standard - start;
                int[] temp_basket = new int[temp_len];

                // ect
                int gap = standard - start;

                // input temp array
                for (int start_basket = (start) - 1; start_basket < (standard - 1); start_basket++) 
                {
                    int temp_basket_num = start_basket - (start - 1);
                    temp_basket[temp_basket_num] = basket[start_basket];
                }

                // switch mid & end
                for (int start_basket = standard - 1; start_basket < end; start_basket++) 
                {
                    int temp_num = basket[start_basket];
                    int target_basket = start_basket - gap;
                    basket[target_basket] = temp_num;
                }

                // basket into temp array
                 for (int start_temp = 0; start_temp < temp_basket.length; start_temp++)
                {
                    int target_basket = (end - standard) + start + start_temp;
                    basket[target_basket] = temp_basket[start_temp];
                }
            }

            for(int val = 0; val < basket.length; val++) 
            {
                System.out.print(basket[val]);
                if (val < (basket.length - 1))
                {
                    System.out.print(" ");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
    }
}