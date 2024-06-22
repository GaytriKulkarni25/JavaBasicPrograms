package String;

public class UnwantedChars {

    public static void main(String[] args) {

        String str="abncjd&&%%";

        str= replaceJunk(str);
        System.out.println(str);



    }

    public static String replaceJunk(String str)
    {
        String st=str.replaceAll("[^A-Za-z0-9]","");

        return st;


    }
}
