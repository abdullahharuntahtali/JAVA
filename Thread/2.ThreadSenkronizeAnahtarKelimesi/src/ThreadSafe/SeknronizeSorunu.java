package ThreadSafe;

import java.util.logging.Level;
import java.util.logging.Logger;



public class SeknronizeSorunu {
    
    private int count = 0;
    
     public void artir(){
        
        count++; 
    }
    
    public void threadleriCalistir(){
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                for (int i = 0; i < 5000; i++) {
                    
                    artir();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                for (int i = 0; i < 5000; i++) {
                    
                    artir();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        
        try {
            t1.join();
        } catch (InterruptedException ex) {
            
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
           
        }

        //Yukarıdaki kodlarımız çalıştıpında normalde 10000 sonucunu bekleriz. Fakat threadlerde senkron sorunu olduğundan bazen
        //bir değeri aynı anda artırırlar yani ikisi toplamda 2 artıracağına 1 artmış olur.
        
        //Bütün threadlerimiz aynı anda çalışıyor. Main metoduda aynı anda çalıştığından count 0' ken ekrana basıyor.
        //join metodu sayesinde threadleri bitmesini bekleriz. Bittikten sonra main threadimiz çalışır.
        System.out.println("Count değişkeninin değeri : "+count); //Main threadimize ait sonuç
    }
    
    public static void main(String[] args) {
    
        SeknronizeSorunu threadsafe = new SeknronizeSorunu();
        
        threadsafe.threadleriCalistir();
        
        
        
    }
}
