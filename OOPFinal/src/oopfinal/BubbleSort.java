package oopfinal;
//import static oopfinal.OOPFinal.array;
public class BubbleSort implements Sorting {
    
    public void sort(int arr[],int a ,int b)
    {
        
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                      System.out.println("Güncel dizi Bubble Sort: ");
        printArray(arr);
                } 
      
    }
    public void printArray(int arr[]){
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
        
    }
    
}
