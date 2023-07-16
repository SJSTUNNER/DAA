// SELECTION SORT:-

import java.util.Scanner;

public class P_1_3 {

    static void selectionSort(int arr[]){

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            
            int key = i;   //key->index with smallest element.. (asssume)

            for(int j=i+1;j<n;j++){

                if(arr[j]<arr[key]){
                    key = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key];
            arr[key]=temp;
        }

        System.out.println("Array after sorting =");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array=");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in array =");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before Sorting=");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        selectionSort(arr);
        
    }
    
}