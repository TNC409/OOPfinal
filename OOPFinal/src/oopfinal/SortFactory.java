
package oopfinal;


public class SortFactory {
    
    
    public static Sorting getSorting(String sortType){
        if(sortType==null){
            return null;
        }
        if(sortType.equalsIgnoreCase("Buble Sort")){
            
            return new BubbleSort();
        }
         if(sortType.equalsIgnoreCase("Quick Sort")){
            
            return new QuickSort();
        }
          if(sortType.equalsIgnoreCase("Insertion Sort")){
            
            return new InsertionSort();
        }
        return null;
    }
}
