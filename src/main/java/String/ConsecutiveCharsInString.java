package String;

public class ConsecutiveCharsInString {

    public static void main(String[] args) {
        String str = "abccbaa";
        String newStr ="";


        int count=1;

        for (int i = 1; i < str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1)) {

                count++;
            }else
            {
                if(count>1)
                {
                    System.out.println("matched :" + str.charAt(i)+ " " + count);
                    newStr= newStr + str.charAt(i-1) + count;


                }
                else {
                    System.out.println("not matched :" + str.charAt(i) + " " + str.charAt(i-1));
                    newStr= newStr + str.charAt(i-1);
                }
                count=1;
            }



        }

        if(count>1)
             newStr= newStr + str.charAt(str.length()-1) + count;

        else
            newStr= newStr + str.charAt(str.length()-1);


        System.out.println("new string :"+newStr);



    }

}
