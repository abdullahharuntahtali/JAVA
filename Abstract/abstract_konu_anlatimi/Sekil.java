package abstract_konu_anlatimi;
public abstract class Sekil {
    
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    
    public void isimini_soyle(){
        System.out.println("Bu obje "+isim+" objesidir.");
    }
    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
