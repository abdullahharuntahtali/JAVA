package Temel_Interface_Ornegi;

import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public void Yolcu(){
        Scanner k=new Scanner(System.in);
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc=k.nextInt();
        k.nextLine();
        System.out.print("Siyasi Yasağınız Bulunuyor mu? (evet ya da hayır)");
        String cevap=k.nextLine();
        if (cevap=="evet") {
            this.siyasiYasak=true;
        }
        else
            this.siyasiYasak=false;
        
        System.out.print("Vizeniz bulunuyor mu? (evet ya da hayır)");
        String cevap2=k.nextLine();
        if (cevap2.equalsIgnoreCase(cevap2)) {
            this.vizeDurumu=true;
        }
        else
            this.vizeDurumu=false;
    }
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc<15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın.");
            return false;
        }
        else{
            System.out.println("Yurtdışı harcı işlemi tamamlandı");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        
        if (this.siyasiYasak) {
            
            System.out.println("Siyasi yazağınız bulunuyor. Yurtdışına çıkamazsınız.");
            return false;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmuyor ...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        
        if (this.vizeDurumu) {
            System.out.println("Vize işlemleri tamam");
            return true;
        }
        else{
            
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
            return false;
        }
            
    }
    
}
