
import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker implements Runnable{

    private String isim;
    private int taskId;

    public Worker(String isim, int taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }
    
    
    
    
    @Override
    public void run() {
        
        System.out.println("Worker "+isim+" "+taskId+". işe başladı..");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println("Worker "+isim+" "+taskId+". işi bitirdi..");
    }

}
