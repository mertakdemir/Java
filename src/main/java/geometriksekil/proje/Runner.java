package geometriksekil.proje;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi seciniz");
        System.out.println("1 = cember alan ve cevre// 2 = kare alan ve cevre// 3 = dikdortgen alan ve cevre");
        int num = scan.nextInt();

        switch (num){

            case 1:
                System.out.println("Cemberin yaricapini giriniz");
                Cember ob1 = new Cember(scan.nextDouble(), 3.14, 1);
                ob1.AlanHesaplama();
                ob1.CevreHesaplama();
                System.out.println(ob1);
                break;

            case 2:
                System.out.println("Karenin bir kenarini girin");
                Kare ob2 = new Kare(scan.nextDouble());
                ob2.AlanHesaplama();
                ob2.CevreHesaplama();
                System.out.println(ob2);
                break;

            case 3:
                System.out.println("Dikdörtgenin önce uzun sonra kisa kenarini giriniz");
                Dikdortgen ob3 = new Dikdortgen(scan.nextDouble(), scan.nextDouble());
                ob3.AlanHesaplama();
                ob3.CevreHesaplama();
                System.out.println(ob3);
                break;

            default:
                System.out.println("Gecersiz opsiyon");
        }
































    }
}
