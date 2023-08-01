// LINEAR-SEARCH 

import java.util.*;
import java.lang.*;
import java.io.*;

public class P_3_1 {
    
    
    static int linearSearch(int arr[],int s){
    int n = arr.length;
    
    for(int i=0;i<n;i++){
        if(s==arr[i])
        return i;
    }
    return -1;
    
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array=");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter elements in array=");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Array elements =");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.print("Enter element to search in array=");
        int s= sc.nextInt();
        
        System.out.println();
        
        int e=linearSearch(arr,s);
        if(e==-1){
            System.out.println("Element you have enetered is not in the array.");
        }
        else{
            System.out.println("Element "+s+" is at index "+e);
        }
            
        }
        
    }