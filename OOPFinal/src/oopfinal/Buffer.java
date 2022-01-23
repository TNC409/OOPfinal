
package oopfinal;


public class Buffer {
    
    private static int bufferArray[][];
    private static  int bufferRowLength;
    private static int bufferColumnLengt;
    public static int eklecekSira=0;  //hangi satırdaki işlem olduğunu söylecek bizde ona göre yerleştireceğiz
    
    
    
    public Buffer(int bufferRowLength, int bufferColumnLengt ){
        this.bufferRowLength=bufferRowLength;
        this.bufferColumnLengt=bufferColumnLengt;
        bufferArray=new int [bufferRowLength][bufferColumnLengt];
    }
    
    public void getEklenecekSira(int i){
        eklecekSira=i;
    }
    
    public static void print(){
        System.out.println("Buffer içindeki array yazdırılıyor..");
        System.out.println(" ");
        for(int i=0;i<bufferRowLength;i++){
            
            for(int y=0;y<bufferColumnLengt;y++){
                
                
            System.out.print(bufferArray[i][y]+ "   ");
        }
            System.out.println(" ");
        }
    }
    
    public synchronized void  put(int eklenecekDeger,int sira){
        
        
        bufferArray[eklecekSira][sira]=eklenecekDeger;
        print();
        
    }
}
