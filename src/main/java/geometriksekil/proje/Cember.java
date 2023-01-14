package geometriksekil.proje;

public class Cember extends Sekil{

public Cember(double yaricap, double pi, double etkisiz){
    super(yaricap, pi, etkisiz);
}

    @Override
    public double AlanHesaplama() {
        return yaricap*yaricap*pi;
    }

    @Override
    public double CevreHesaplama() {
        return 2*pi*yaricap;
    }

    @Override
    public String toString() {
        return "Yaricap = " + yaricap + " Pi = " + pi + " Etkisiz = " + etkisiz + " Cemberin alani = " + AlanHesaplama() + " Cemberin cevresi = " + CevreHesaplama();
    }
}
