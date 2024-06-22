package Number;

public class AutomorphicNum {

    public static void main(String[] args)
    {
       int num=75;
       int squareOfNum= num*num;

    String numberStr= String.valueOf(num);
    String squareStr= String.valueOf(squareOfNum);

    if(squareStr.contains(numberStr))
        System.out.println("AutomorphicNum");
    else
        System.out.println("not Automorphic Num");

    }


}
