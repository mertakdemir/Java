package geometriksekil.proje;

public class Kare extends Dikdortgen{

    public Kare(double kenar){
        super(kenar);
    }

    @Override
    public double AlanHesaplama() {
        return kenar*kenar;
    }

    @Override
    public double CevreHesaplama() {
        return 4*kenar;
    }

    @Override
    public String toString() {
        return " Kenar = " + kenar + " Karenin alani = " + AlanHesaplama() + " Karenin cevresi = " + CevreHesaplama();
    }
}
