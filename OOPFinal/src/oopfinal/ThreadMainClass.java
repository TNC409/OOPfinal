
package oopfinal;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreadMainClass {
      public static ArrayList<String> listem =new ArrayList();
      public static ArrayList<String> listem2 =new ArrayList();
      
      
      public static void main(String[] args) throws InterruptedException {
          

      
        int Matris1[][];
         int uzunluk_tutucu; //bu sırası ile her satırdaki kelimenin uzunluğunu tutacak ve bu sayede o uzunlukta bir array oluşturacağız
         int ColumnUznunluk = 0;
         int RowUzunluk=0;
          try{
               File mf=new File("matris1.txt");    //açacağınmız text'î belirttik
               Scanner scanner = new Scanner(mf);  //burada okuduk
               while (scanner.hasNextLine()) {   //satır sayısı kadar dönen while döngüsü
                    String line = scanner.nextLine();
                   
                    
                   uzunluk_tutucu=line.length();   //burada atama yapacağızmız uzunluk değişkenini atadık
                   String ilkArray[]=new String[uzunluk_tutucu];    //text'en aldığımız sayıları  split edip kontrol array'ine atadık
                  
    
    
                      ilkArray=line.split(" ");  //split edip sayıları kontrol'ün içine attık   
                      ColumnUznunluk=(uzunluk_tutucu+1)/2;
                      for(int i=0;i<ColumnUznunluk;i++){
                        
                       listem.add(ilkArray[i]);
                       
                       
                      
                      } //end of for
                      RowUzunluk++;
                     
               } //end of while
                scanner.close();
          } //en of try
          
          
          catch(Exception e){
              System.out.println("Dosya Hatası ");
          } //end of catch 
          
          
          
          
          
          
          
          
     Matris1=new int[RowUzunluk][ColumnUznunluk];
          
          int rowTutucu=0;
          int columnTutucu=0;
          for (String st:listem){
              
               int temp=Integer.parseInt(st);
              Matris1[rowTutucu][columnTutucu]=temp;
              columnTutucu++;
              if(columnTutucu==ColumnUznunluk){
                  rowTutucu++;
                  columnTutucu=0;
              }
              
              
           
          }  //end of for each
          
          
      
              System.out.println("Matris 1'in ilk hali yazdırılıyor..."); 
      for(int i=0;i<RowUzunluk;i++){
  //  System.out.println("MAtris1 1 Row uzun : "+ RowUzunluk);
    for(int z=0;z<ColumnUznunluk;z++){
       // System.out.println("MAtris1 Column uzun : "+ ColumnUznunluk);
      System.out.print( Matris1[i][z]);   
    }
          System.out.println(" ");
}
      
      
      
       int Matris2[][];
         int uzunluk_tutucu2; //bu sırası ile her satırdaki kelimenin uzunluğunu tutacak ve bu sayede o uzunlukta bir array oluşturacağız
         int ColumnUznunluk2 = 0;
         int RowUzunluk2=0;
          try{
               File mf=new File("matris2.txt");    //açacağınmız text'î belirttik
               Scanner scanner = new Scanner(mf);  //burada okuduk
               while (scanner.hasNextLine()) {   //satır sayısı kadar dönen while döngüsü
                    String line = scanner.nextLine();
                   
                    
                   uzunluk_tutucu2=line.length();   //burada atama yapacağızmız uzunluk değişkenini atadık
                   String ilkArray2[]=new String[uzunluk_tutucu2];    //text'en aldığımız sayıları  split edip kontrol array'ine atadık
                  
    
    
                      ilkArray2=line.split(" ");  //split edip sayıları kontrol'ün içine attık   
                      ColumnUznunluk2=(uzunluk_tutucu2+1)/2;
                      for(int i=0;i<ColumnUznunluk2;i++){
                        
                       listem2.add(ilkArray2[i]);
                       
                       
                      
                      } //end of for
                      RowUzunluk2++;
                     
               } //end of while
                scanner.close();
          } //en of try
          
          
          catch(Exception e){
              System.out.println("2. Dosya Hatası ");
          } //end of catch 
          
      
      
      
          
          
          
             Matris2=new int[RowUzunluk2][ColumnUznunluk2];
          
          int rowTutucu2=0;
          int columnTutucu2=0;
          for (String st:listem2){
              
               int temp=Integer.parseInt(st);
              Matris2[rowTutucu2][columnTutucu2]=temp;
              columnTutucu2++;
              if(columnTutucu2==ColumnUznunluk2){
                  rowTutucu2++;
                  columnTutucu2=0;
              }
              
              
           
          }  //end of for each
          
          
      
      System.out.println("Matris 2'nin ilk hali  yazdırılıyor..."); 
      for(int i=0;i<RowUzunluk2;i++){
    for(int z=0;z<ColumnUznunluk2;z++){
      System.out.print( Matris2[i][z]);   
    }
          System.out.println(" ");
}
      
      
      
      
      Buffer bufer=new Buffer(RowUzunluk, ColumnUznunluk2);
        //  System.out.println("Row Uzunluk: "+RowUzunluk );
    for (int i=0;i<RowUzunluk;i++){
        
         Thread mp1=new Thread(new MultiplyWorker(Matris1,Matris2,i,bufer));
         
          mp1.start();  
          mp1.join();
    }      
  
    
    
    
    
    
    
    
    
    
    
 
      } //en of main class

      }  // end of class
 
      

