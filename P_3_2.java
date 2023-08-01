// BINARY-SEARCH
import java.util.*;

public class P_3_2
{

    static int binarySearch(int arr[],int key)
    {

        int n=arr.length;
        int s=0;
        int e=n-1;

        while(s<=e)
        {
            int mid=(s+e)/2;
            
            if(arr[mid]==key)
            {
                return mid; 
            }
            else if(arr[mid]>key)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array=");
        int n = sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter elements in array=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search=");
        int key=sc.nextInt();

        int result = binarySearch(arr,key);
        if(result==-1)
        {
            System.out.println("Element is not present in array");
        }
        else
        {
            System.out.println(key+" is at index "+result);
        }    

    }
}