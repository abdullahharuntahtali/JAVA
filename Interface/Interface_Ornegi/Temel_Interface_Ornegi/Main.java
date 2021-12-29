package Temel_Interface_Ornegi;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz....");

        String sartlar = "Yurtdışı Çıkış Kuralları ... \n"
                + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor... \n"
                + "15 TL harç bedelinizi tam olarak yatırmanız gerekiyo ... \n"
                + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";

        String message = "Yurtdışı şartlarının hepsini sağlamanız gerekiyor.";

        while (true) {

            System.out.println("********************************************************************");
            System.out.println(message);
            System.out.println("********************************************************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç Bedeli Kontrol Ediliyor...");

            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);
            if (yolcu.yurtDisiHarciKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;
        }
    }

}
