
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        
        //Threadlerimizi 2'li havuz ile çalıştırmak istiyoruz. Yani aynı anda maximum 2 thread çalısın demiş olduk
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) { //5 Thread oluşturacağımız için

            executor.submit(new Worker(String.valueOf(i), i));

        }

        //Threadlerimizin işi bittiğinde kapanır. Eğer shutdoown kullanmazsak main threadimizi hiçbir zaman bitirmeyecek.
        executor.shutdown(); // Bu sayede başka thread ataması yapmıycağımızı belirtmiş olduk. shutdown yapmazsak program bitmez. Çünkü hep thread bekler.
        System.out.println("Bütün işler teslim edildi.");
        
        try {
            
            //await ile bu işlemlerin bitmesini 1 gün bekleyebilirsin dedik. Eğer 1 günden fazla sürerse işlemi kendiliğinden sonlandırır
            executor.awaitTermination(1, TimeUnit.DAYS);

        } catch (InterruptedException ex) {
            
        }

        System.out.println("Bütün işler bitti.");
        
        //Aşağıdaki kod threadlerimizi amatör şekilde kontrol etmeye yarar. Threadlerimiz fazlalalışrsa aşağıdaki kod yazılımcıyı epeyce yorar. 
        /*
            Thread t1 = new Thread(new Worker("1", 1));
            Thread t2 = new Thread(new Worker("2", 2));
            Thread t3 = new Thread(new Worker("3", 3));
            Thread t4 = new Thread(new Worker("4", 4));
            Thread t5 = new Thread(new Worker("5", 5));
            
            
            System.out.println("Bütün işler teslim edildi.");
            
            t1.start();
            t2.start();
            
            try {
            t1.join();
            t2.join();
            } catch (InterruptedException ex) {
            }
            
            t3.start();
            t4.start();
            
            try {
            t3.join();
            t4.join();
            } catch (InterruptedException ex) {
            }
            
            t5.start();
            try {
            t5.join();
            } catch (InterruptedException ex) {
            }
            
            System.out.println("Bütün işler tammalandı.");
         */
    }
}
