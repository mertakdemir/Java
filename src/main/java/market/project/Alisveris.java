package market.project;

import java.util.*;

public class Alisveris {




    static Scanner scan = new Scanner(System.in);

    public static List<String> urunler = new ArrayList<>(Arrays.asList("Elma", "Mandalina", "Domates", "Patlican", "Biber"));
    public static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.4, 5.6, 7.0, 1.5, 5.0));

    public static List<String> sepetListesi = new ArrayList<>();
    public static List<Double> sepetkg = new ArrayList<>();
    public static List<Double> sepetFiyati = new ArrayList<>();

    public static void main(String[] args) {

        String tercih;
        double toplamFiyat = 0;

        do {
            urunleriListele();
            System.out.println("Almak istediginiz urun numarasini secin");
            int num = scan.nextInt();

            System.out.println("Almak istediginiz kilogrami yazin");
            double kg = scan.nextDouble();

            sepeteEkle(num, kg);
            toplamFiyat = Math.round(sepetiYazdir());
            System.out.println("Devam etmek icin 'e' ye tamamlamak icin 'h' ye basin");
            tercih = scan.next().toLowerCase().substring(0,1);
        } while (tercih.equalsIgnoreCase("e"));
        odeme(toplamFiyat);

    }
    public static void odeme(double toplamFiyat){

        System.out.println("======ODEME======");
        System.out.println("Toplam tutar = " + toplamFiyat);
        double nakit = 0;
        do {

            System.out.println("Nakit bedelini giriniz");
            nakit = scan.nextDouble();

            if (nakit < toplamFiyat) {
                System.out.println("Yetersiz nakit girdiniz");
                System.out.println("Kalan borcunuz = " + (toplamFiyat - nakit));
            }
        }while (nakit<toplamFiyat);

        double paraUstu = nakit-toplamFiyat;

        if(paraUstu>0){
            System.out.println("Para ustunuz = " + paraUstu);
        }
        System.out.println("Yine bekleriz");
    }


public static void sepeteEkle(int urunNo, double urunKg){

    sepetListesi.add(urunler.get(urunNo));
    sepetkg.add(urunKg);
    sepetFiyati.add(fiyatlar.get(urunNo));
}

public static double sepetiYazdir(){
    double fiyatToplami = 0;
    double kgToplam = 0;

    System.out.println("Urun no " + " Urun kg " + " Urun fiyati ");

    for (int i = 0; i<sepetListesi.size(); i++) {

        System.out.println(sepetListesi.get(i) + "    " +  sepetkg.get(i) + "     " + sepetFiyati.get(i));
        fiyatToplami = sepetkg.get(i)*sepetFiyati.get(i);
        kgToplam += sepetkg.get(i);
    }
    System.out.println("Kilogram toplami = " + kgToplam + " Toplam fiyat = " + fiyatToplami);
    return fiyatToplami;
}

public static void urunleriListele(){

    System.out.println("Urun no " + " Urun kg " + " Urun fiyati");

    for (int i = 0 ; i<urunler.size(); i++){

        System.out.println(i + "   " + urunler.get(i) + "   " + fiyatlar.get(i));
    }
}

}


