package Array;

public class SearchElement {

    public static void main(String[] args) {

        int[] arr={2,1,3,44,5};
        int ele=0;
        int search= searchEle(arr,44);
        System.out.println(search);



    }

    public static int searchEle(int[] arr,int ele)
    {

        int temp=0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==ele) {
                temp = ele;
                break;
            }
        }

        return temp;


    }
}
