package Number;

public class primeNumber {

    public static void main(String[] args)
    {
        int num=7;
        boolean flag=true;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }


        }
        if(flag)
            System.out.println("prime number");
        else
            System.out.println("not prime number");


    }

}
