package oopfinal;

import java.util.Random;
import java.util.Scanner;


public class OOPFinal {

     public static int array[]=new int[100];
     
    public static void main(String[] args) {
        
        long basla=System.nanoTime();
        Random random=new Random();
        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(50);
        }
        
        
        
        Scanner input=new Scanner(System.in);
        SortFactory sortFactory=new SortFactory();
        System.out.println("Hangi Sıralama algoritması ile diziyi sıralamak istersiniz onu seçiniz");
        System.out.println("1: Buble Sort");
        System.out.println("2: Quick Sort");
        System.out.println("3: Insertion Sort");
        int number=input.nextInt();
        
        String degisken = null;
        int arrayLengt= array.length;
        switch(number){
            
            case 1:
                degisken="Buble Sort";
                 Sorting sort1=  SortFactory.getSorting(degisken);
                sort1.sort(array, 0, 0);
                //  System.out.print("Current Time in milliseconds = "+ System.nanoTime());
                
                break;
                
                
            case  2:
                degisken="Quick Sort";
              Sorting sort2=  SortFactory.getSorting(degisken);
                
                sort2.sort(array, 0, arrayLengt-1);
             //   System.out.print("Current Time in milliseconds = "+ System.currentTimeMillis());

                 break;
                 
            case 3:
                
                degisken="Insertion Sort";
                 Sorting sort3=  SortFactory.getSorting(degisken);
                 sort3.sort(array, 0, 0);
              // System.out.print("Current Time in milliseconds = "+ System.currentTimeMillis());

                 break;
        }
        
        


        long finish=System.nanoTime();
 
        long sonuc=basla-finish;
           System.out.println("Geçen Zaman: "+  sonuc);
    
    }
    
}
