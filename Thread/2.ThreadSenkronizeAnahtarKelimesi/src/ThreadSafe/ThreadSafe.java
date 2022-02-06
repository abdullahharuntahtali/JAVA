package ThreadSafe;

public class ThreadSafe {

    private int count = 0;
    
    public synchronized void artir(){
        
        count++; // Bu sayede burdaki işlem bitmeden diğer threadler giriş yapamaz.
    }

    public void threadleriCalistir() {

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


        System.out.println("Count değişkeninin değeri : " + count); //Main threadimize ait sonuç
    }

    public static void main(String[] args) {

        ThreadSafe threadsafe = new ThreadSafe();

        threadsafe.threadleriCalistir();

    }
}
