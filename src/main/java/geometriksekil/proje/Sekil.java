package geometriksekil.proje;

public class Sekil {

    public double kisaKenar;
    public double uzunKenar;
   public double kenar;
   public double yaricap;
    public double pi = 3.14;
    public double etkisiz = 1;

    public Sekil(){

    }

    public Sekil(double kisaKenar, double uzunKenar){
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Sekil(double kenar){
        this.kenar = kenar;
    }

    public Sekil(double yaricap, double pi, double etkisiz){
        this.yaricap = yaricap;
        this.pi = pi;
        this.etkisiz = etkisiz;
    }

    public double AlanHesaplama(){
        return 0;
    }

    public double CevreHesaplama(){
        return 0;
    }


}





















