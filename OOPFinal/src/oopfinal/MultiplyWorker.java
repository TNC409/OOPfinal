
package oopfinal;


public class MultiplyWorker implements  Runnable{
 //   private int row;
  //  private int column;
    private int Matris1[][];
    private int Matris2[][];
    public  int islemsay=0;
    private Buffer bufferim;
       
  
    public MultiplyWorker( int Matris1[][] , int Matris2[][],int islemsay ,Buffer bufferim){
      //  this.row=row;
      //  this.column=column;
        this.Matris1=Matris1;
        this.Matris2=Matris2;
        this.islemsay=islemsay;
        this.bufferim=bufferim;
  
    }
        
  
      
       
    
       
    @Override
    public void run(){
        //burada gerekli sayıları alınıp çarpılacak ve alttaki gibi put işlemi yapılacak
        System.out.println(Thread.currentThread().getName());
      int deger=0;
          try{
              
             // Alttaki 2 döngü de doğru dönüyor
              for (int i=0;i<Matris1.length;i++){
                  for(int y=0;y<Matris2.length;y++){
                    // *********************  System.out.println("Matris2[1]: "+ Matris2[1].length);
                     
                  deger+= Matris1[islemsay][y]*Matris2[y][i];
                    //  System.out.println("carpım 1 : " + Matris1[islemsay][y] + " carpım2 : "+Matris2[y][i] + "  i: "+ i +" y: "+ y +" Matris1: "+ Matris1.length +" Matris2 .0: "+ Matris2[0].length );
                    //  System.out.println("islem say:"+ islemsay);
                  }
                  
                  bufferim.getEklenecekSira(islemsay);
                  
                  System.out.println("Elde edilen deger: "+ deger );
                  bufferim.put(deger,i);
                  
                  deger=0;
              }
              Thread.sleep(1000);
              
   

             
             
        } //end of try
         
        catch(InterruptedException e){
            System.out.println("Thread Hataa");
           }
        
        
        
          } // end of run methode
         
  
    
} //end of class
 