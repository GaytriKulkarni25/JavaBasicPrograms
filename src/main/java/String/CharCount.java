package String;

import java.util.HashMap;
import java.util.Map;

public class CharCount {


    public static void main(String[] args) {
        String str = "Hey Ram Hi How are you?";

        str=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str);
       /* for(int i=0;i<str.length()-1;i++) {
            System.out.println(str.charAt(i) + " " + (int) str.charAt(i));

        }*/
        int len=str.length();

        int[] Uppercount= new int[256];

        int[] lowercount= new int[256];


        for (int i = 0; i < len; i++) {

            char c=str.charAt(i);

            if(Character.isUpperCase(c))
                Uppercount[(int)c]++;
            if(Character.isLowerCase(c))
                lowercount[(int)c]++;

        }

        for (int i = 0; i < 256; i++) {
            if (Uppercount[i] > 0) {
                System.out.println((char) i + " (Uppercase): " + Uppercount[i]);
            }
            if (lowercount[i] > 0) {
                System.out.println((char) i + " (Lowercase): " + lowercount[i]);
            }
        }








    }



}
