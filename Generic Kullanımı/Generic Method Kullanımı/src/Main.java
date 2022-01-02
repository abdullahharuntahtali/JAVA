public class Main {

    public static void main(String[] args) {

        Sayisal s1=new Sayisal(30, 40, 20, 30);
        Sayisal s2=new Sayisal(25, 45, 2, 35);
        
        Sayisal birinciSayisal=birinci(s1,s2);
        
        System.out.println("1. Sayısal Öğrencinin Puanı : "+birinciSayisal.puanHesapla());
    
        EsitAgirlik e1=new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik e2=new EsitAgirlik(40, 10, 50, 0);
        
        EsitAgirlik birinciEsitAgirlik= birinci(e1,e2);
    System.out.println("1. Eşit Ağırlık Öğrencinin Puanı : "+birinciEsitAgirlik.puanHesapla());
    }

    public static <E extends Aday> E birinci(E e1, E e2){
        
        if (e1.puanHesapla()>e2.puanHesapla()) {
            return e1;
        }
        else
            return e2;
        
    }
    
}
