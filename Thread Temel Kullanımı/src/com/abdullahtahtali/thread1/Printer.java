package com.abdullahtahtali.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

//Thread için 1. yöntemimiz.
public class Printer extends Thread {

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    
    //Ayrı bir thread
    @Override
    public void run() {
        System.out.println(isim+" Çalışıyor.");
        for (int i = 0; i <= 10; i++) {
            
            try {
                System.out.println(isim+" Yazıyor : "+i); 
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı.");
            }
        }
        System.out.println(isim+" işini bitirdi.");
        
    }
    
    
    
}
