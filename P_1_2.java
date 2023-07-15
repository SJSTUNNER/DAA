//INSERTIONSORT TECHNIQUE

import java.util.*;

public class P_1_2{

    static void insertionSort(int arr[]){
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
                            
            while(j>=0 && arr[j]>key){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
            //12,22,7,4,2
            //      k=2   
            // 2,  4,  7, 12, 22    <--elements of array
            // 0   1   2  3  4      <--index
            // j             i
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in array=");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting=");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        insertionSort(arr);

        System.out.println("\nArray after Sorting = ");

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}