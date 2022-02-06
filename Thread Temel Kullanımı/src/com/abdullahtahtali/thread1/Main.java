package com.abdullahtahtali.thread1;

//Thread için 1. yöntemimiz.
public class Main {

    public static void main(String[] args) {
        
        Printer p1 = new Printer("Printer 1");
        Printer p2 = new Printer("Printer 2");
        
        
        
        //Şuan 3 thread oluşturmuş olduk 1) p1 2)p2 3)main Thread
        //Elimizdeki 3 thread Jvm ve işletim sistemine bağlı olarak rastgele çalışırlar. Her çalıştırdığımızda farklı sonuçlar alırız.
        p1.start();
        p2.start();
        
        System.out.println("Main Thread çalışıyor.");
    }
}
