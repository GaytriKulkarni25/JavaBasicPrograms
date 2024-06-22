package Number;

public class petersonNo {

    static int num=145, rem=0,sum=0;

    public static void main(String[] args)
    {


        while(num>0)
        {
            rem = num % 10;
            sum=sum + factorial(rem);

            num=num/10;


        }

        if(num==sum)
            System.out.println("peterson number");
        else
            System.out.println("not peterson number");




    }

    public static  int factorial(int num)
    {

        int fact=1;
        while(num>0)
        {
            fact= fact*num;
            num--;
        }

        return fact;
    }

}
