package Array;


import java.util.Scanner;

//Create an array of 5 floats and calculate their sum.
public class sumOfArray {
    public static void main(String[] args)
    {
        float arr[]= new float[5];
        Scanner in = new Scanner(System.in);

        int count=0;
        float sum=0f;


        while(count<5) {
            float b = in.nextFloat();
            arr[count]=b;
            sum = sum +arr[count];
            count++;
        }

        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println(sum);

    }


}
