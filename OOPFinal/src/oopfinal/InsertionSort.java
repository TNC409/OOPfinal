package oopfinal;
import static oopfinal.OOPFinal.array;

public class InsertionSort implements Sorting {
    
    
     @Override
    public void sort(int arr[],int a,int b){
        
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            }
            System.out.println("Güncel Dizi ");
            printArray(arr);
            arr[j + 1] = key; 
        } 
        
    }
     static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
