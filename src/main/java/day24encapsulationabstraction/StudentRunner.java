package day24encapsulationabstraction;

public class StudentRunner {

        /*
                      Encapsulation
               Encapsulation is "Data hiding"
               To hide a data we make the access modifier "private"
               After "hiding data", you may need to "read" or "update" the data.
               To "read" or "update" the data we will create some methods.
               To "read" "encapsulated data" you should create "get()" method, we name it "getters"
               To "update" "encapsulated data" you should create "set()" method, we name it "setters"

               "get()" and "set()" methods are called "Java Beans"
         */


    public static void main(String[] args) {


        Student std1 = new Student();

        System.out.println(std1.name);

        System.out.println(std1.getStdId());

        std1.setDisease("Cancer");

        System.out.println(std1.getDisease());

        std1.setStdGpa(4.0);

        System.out.println(std1.getStdGpa());

        std1.setSuccessful(true);

        System.out.println(std1.isSuccessful());




    }
}
