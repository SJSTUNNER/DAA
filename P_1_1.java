// BUBBLESORT TECHNIQUE------->
import java.util.*;

/* class bubblesort{
    int n;

    public void setN(int n){
        this.n = n;
    }

    int temp =0;
    
    public void bubbleSorting(int arr[]){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){

                    temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;

                }
            }
        }
    }

    public void display(int arr[]){
        System.out.println("\nArray after sorting=");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

} */

public class P_1_1{

    static void bubbleSort(int arr[]){
        int n = arr.length;
        int temp =0;
        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter element in array=");
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Sorting=");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        /* bubblesort bs = new bubblesort();

        bs.setN(n);                     //this is for class method 
        bs.bubbleSorting(arr);
        bs.display(arr); */

        bubbleSort(arr);

        System.out.println("Array after sorting= ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }
}