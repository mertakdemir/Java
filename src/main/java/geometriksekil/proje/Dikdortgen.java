package geometriksekil.proje;

public class Dikdortgen extends Sekil{

public Dikdortgen(double uzunKenar, double kisaKenar){
    super(kisaKenar, uzunKenar);
}

public Dikdortgen(double kenar){
    super(kenar);
}

    @Override
    public double AlanHesaplama() {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double CevreHesaplama() {
        return 2*(kisaKenar+uzunKenar);
    }

    @Override
    public String toString() {
        return
                " Uzun kenar = " + uzunKenar + " Kisa kenar = " + kisaKenar + " Dikdörtgenin alani = " + AlanHesaplama() + " Dikdörtgenin cevresi = " + CevreHesaplama();
    }
}
