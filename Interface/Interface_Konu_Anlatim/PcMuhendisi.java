package Interface_Konu_Anlatim;

public class PcMuhendisi implements IMuhendis,ICalisma{

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void calis() {
        System.out.println("Makine Mühendisi çalışıyor...");
    }
    
    void xxx(){
        System.out.println("DENEME");
    }
    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) 
            System.out.println("Askerliğimi Yaptım.");
        
        else        
            System.out.println("Askerliğimi henüz Yapmadım.");
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        
        return "Ortalamam : "+ derece;
       
    }

    @Override
    public void adli_sicil_sorgula() {
        if (askerlik)
            System.out.println("Adli Sicilim Bulunuyor");
        else
            System.out.println("Adli Sicil Kaydım Bulunmuyor.");
    }

    @Override
    public void is_tectrubesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi Olarak şu Şirketlerde Çalıştım ....");
    
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
