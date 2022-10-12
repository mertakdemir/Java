package day12constructorsMethodCallStaticKeyWord;


public class Runner {
    public static void main(String[] args) {

        //Create an object from "Car" class

        Car audi = new Car();
        System.out.println(audi.make);

        Car bmw = new Car("BMW", "M5", 2022, 50000);
        System.out.println(bmw.make);

        Car mercedes = new Car("Mercedes", "C300", 2023, 60500);
        System.out.println(mercedes.make);

        Car itCar = new Car("Rolce Royce", "Cullinan" , 2023);
        System.out.println(itCar.make);
        System.out.println(itCar.model);
        System.out.println(itCar.year);


        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();

        System.out.println(obj3.nonStaticCounter);
        System.out.println(obj3.staticCounter);
    }
}
