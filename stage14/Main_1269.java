package stage14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_1269 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] AB = br.readLine().split(" ");
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);
            String[] aData = br.readLine().split(" ");
            String[] bData = br.readLine().split(" ");

            Arrays.sort(aData, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.parseInt(o1) - Integer.parseInt(o2);
                }
            });

            Arrays.sort(bData, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.parseInt(o1) - Integer.parseInt(o2);
                }
            });

            int count = 0;

            for(String a :aData) {
                if(getIndex(bData, a)) {
                    ++count;
                }
            }

            System.out.println(aData.length + bData.length - (count * 2));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean getIndex(String[] data, String target) {

        int value = Integer.parseInt(target);
        int minValue = Integer.parseInt(data[0]);
        int maxValue = Integer.parseInt(data[data.length - 1]);

        if(value < minValue || value > maxValue) {

            return false;

        } else if(value == minValue || value == maxValue) {

            return true;

        } else {

            int lowLength = 0;
            int maxLength = data.length;
            int targetLength = data.length/2;

            while(true) {

                int compareValue = Integer.parseInt(data[targetLength]);

                if(value == compareValue) {
                    return true;
                } else if(value > compareValue) {

                    lowLength = targetLength;
                    int newTargetLength = lowLength + (maxLength - lowLength)/2;

                    if(newTargetLength == targetLength || newTargetLength >= maxLength || newTargetLength <= lowLength) {
                        return false;
                    } else {
                        targetLength = newTargetLength;
                    }
                } else {

                    maxLength = targetLength;
                    int newTargetLength = lowLength + (maxLength - lowLength)/2;

                    if(newTargetLength == targetLength || newTargetLength >= maxLength || newTargetLength <= lowLength) {
                        return false;
                    } else {
                        targetLength = newTargetLength;
                    }
                }
            }
        }
    }
}
