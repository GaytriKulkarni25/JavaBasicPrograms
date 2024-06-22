package String;

public class ReverseString {
    public static void main(String[] args)
    {
        String str="abc";
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev= rev + str.charAt(i);
        }
        System.out.println(rev);

       revSen("My name is Gayatri");



    }

    public static void revSen(String str)
    {
        String str1=str;
        String rev="";


        String[] strArr= new String[50];

        strArr= str1.split(" ");

        for(String s : strArr) {
            for(int i=s.length()-1;i>=0;i--)
            {
                rev=rev + s.charAt(i);

            }
            rev=rev+ " ";
        }
        System.out.println(rev);

    }

}
