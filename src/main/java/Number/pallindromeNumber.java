package Number;

public class pallindromeNumber {
    public static void main(String[] args)
    {
        int n= 454;
        int num=n;
        int temp=0;
        int rem=0;

        while(n>0) {
            rem = n % 10;
            temp = (temp *10)+ rem;
            n=n/10;
        }

    if(num==temp)
        System.out.println("pallindrome");
    else
        System.out.println("not pallindrome");


    }
}
