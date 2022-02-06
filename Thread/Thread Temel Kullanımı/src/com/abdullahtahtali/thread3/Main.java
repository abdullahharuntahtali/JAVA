package com.abdullahtahtali.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor.");
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Yazıyor : "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("");
            }
        }).start();
        

        
         System.out.println("Main Thread çalışıyor.");
    }
    
}
