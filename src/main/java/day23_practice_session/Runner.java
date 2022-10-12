package day23_practice_session;

import day22inheritancepolymorphism.Animal;

public class Runner {

    public static void main(String[] args) {

        Q04_Animal obj1 = new Q04_Animal();

        obj1.consume(); //"All animals consume different food."
        obj1.eat(); //"Animals eat..."
        obj1.drink();//"Animals drink..."
        obj1.move();//"Animals can move..."
        obj1.weight();//"All animals have weight"
        obj1.cells();//All creatures have cells

        Q04_Dog obj2 = new Q04_Dog();
        obj2.bark();//"Dogs bark..."
        obj2.eat();//"Dogs eat meat."
        obj2.consume();//"All animals consume different food."
        obj2.drink();//"Animals drink..."
        obj2.move();//"Animals can move..."
        obj2.weight();//"All animals have weight"
        obj2.cells();//"All animals have cells."

    }
}
