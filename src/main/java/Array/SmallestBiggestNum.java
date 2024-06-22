package Array;

public class SmallestBiggestNum {




    public static void main(String[] args) {

    int[] arr={2,1,3,44,5};

    int small= findSmallest(arr);
    System.out.println(small);

        int big= findbiggest(arr);
        System.out.println(big);

    }

    public static int findSmallest(int[] arr)
    {
        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }

        }

        return arr[0];


    }


    public static int findbiggest(int[] arr)
    {
        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }

        }

        return arr[0];


    }


}
