package String;

public class Pallindrome {

    public static void main(String[] args)
    {
        String str="madam";
        int len= str.length();
        boolean flag=true;

        if(str.charAt(0)!=str.charAt(len-1))
            System.out.println("string is not pallindrome");
        else
        {
            System.out.println("checking further");

            for(int i=0,j=len-1;i<j;i++,j--)
            {

                    if (str.charAt(i) != str.charAt(j)) {
                        System.out.println(str.charAt(i) + " " + str.charAt(j));
                        flag=false;
                        break;
                    }



            }
            if(flag)
                System.out.println("pallindrome");
            else
                System.out.println("not pallindrome");
        }

    }


}
