package Number;

public class armstrong {

    public static void main(String[] args)
    {
        int num=123;
        int temp=num;

        int digit=0;

        int last=0;
        double sum=0;


        while(temp>0)
        {
         temp=temp/10;
         digit++;
        }

        System.out.println(digit);

        temp=num;

        while(temp>0)
        {
            last=temp%10;

            sum= sum + (Math.pow(last,digit));

            temp=temp/10;

        }

        if(num==sum)
            System.out.println("armstrong number");
        else
            System.out.println("not armstrong number");






    }
}
