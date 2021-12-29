package Interface_Konu_Anlatim;

public class Main {

    public static void main(String[] args) {

        PcMuhendisi muhendis1 = new PcMuhendisi(true, false);
        muhendis1.xxx();

        IMuhendis m = new PcMuhendisi(true, true);

        // m.xxx();  --> Bu kod satırı çalışmaz. Çalışabilmesi için aşağıfaki MakineMunendisi referansındaki gibi kullanmak gerekir.
        IMuhendis muhendis2 = new MakineMuhendisi(true, false);
        String[] tecrube = {};
        String[] referans = {"Abdullah Harun TAHTALI", "Habibullah TAHTALI", "Hasan Basri TAHTALI"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.5));
        muhendis2.is_tectrubesi(tecrube);
        
        /*Tür Dönüşüm Örneği olsun diye böyle yaptık. Fakat güvenlilik açısın nesneyi;
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);  şeklinde oluşturmamız burada daha makul olurdu.*/
        ((MakineMuhendisi) muhendis2).referans_getir(referans);

    }
}
