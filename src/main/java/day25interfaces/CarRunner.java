package day25interfaces;

public class CarRunner {

    public static void main(String[] args) {



        System.out.println(Ac.price);
        System.out.println(Brake.price);
        System.out.println(Engine.price);
        System.out.println(Ac.name);
        System.out.println(Brake.luxury);

        Honda h = new Honda();
        System.out.println(h.calculate());
        System.out.println(Ac.climate());


    }
}
