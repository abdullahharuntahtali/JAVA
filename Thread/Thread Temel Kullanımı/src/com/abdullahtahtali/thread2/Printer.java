package com.abdullahtahtali.thread2;

//Thread için 2. yöntemimiz.
public class Printer implements Runnable {

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {

        System.out.println(isim + " Çalışıyor.");
        for (int i = 0; i <= 10; i++) {

            try {
                System.out.println(isim + " Yazıyor : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı.");
            }
        }
        System.out.println(isim + " işini bitirdi.");

    }

}
