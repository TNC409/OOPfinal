package oopfinal;


public class QuickSort implements Sorting{

    
    
     @Override
    public void sort(int arr[],int low ,int high){
        
         if (low < high) 
        { 
           
            int pi = partition(arr, low, high); 
  
           
            
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
    
    
    
    
      int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                System.out.println("Güncel Dizi Quick Sort");
            printArray(arr);
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
     
     static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    
}
