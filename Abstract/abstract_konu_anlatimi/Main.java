package abstract_konu_anlatimi;

public class Main {

    public static void main(String[] args) {
        
        //Sekil sekil=new Sekil("Sekil"); Hata verir. Çünkü abstract class soyutlaştırılamaz
        
        //Fakat aşağıdaki gibi kullanılabilir.***Abstract classların referansları alt sınıflarına eşitlenebilir!!!
        Sekil sekil=new Kare("Kare1",3);
        sekil.alan_hesapla();
        ((Kare)sekil).cevre_hesapla();
        
        
        Kare kare1=new Kare("Kare2",5);
        Daire daire1=new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        
    }
     
}
