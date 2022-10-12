package day25interfaces;

/*
  1)An interface cannot have "concrete method"

  2)All methods in an interface are "public" and "abstract" as default.
    Because of that; even you do not declare the methods "public" and "abstract", they will be "public" and "abstract".
    "public abstract void digital();" and "void digital();" are same

  3)If "parent interfaces" have methods with the same name, overriding just one of them will be enough.

  4)"Parent interfaces" cannot have methods with the same name and the different return types.
     If you do that Java will give you compile time error.

  5) Variables in an interface are "public", "static", and "final".
     "public static final int price = 2300;" and "int price = 2300;" are same.

  6)Variables in interfaces are "static" default, therefore no need to create object to access
          variables in interfaces.

  7)Whenever you need to call any variable use "Interface Name" to call

  8)"Class" parent of another "Class" ==> Use "extends" keyword
    "Interface" parent for another "Interface" ==> Use "extends" keyword

    "Interface" parent of "Class" ==> Use "implements" keyword
    ""Class" parent of "Interface" ==> Impossible. ==> An "Interface" can have "just" Interface as parent.
 */

public interface Ac extends BigAc {

    public void digitalAc ();

    void price();

     int price = 2300;

     String name = "Perfect AC";

     //To create a "concrete method" in an interface you have 2 options.
     //i)Use "default" keyword    ii)Use "static" keyword

    //i) Use "default" keyword
    public default int calculate() {
        return 1200;
    }


    //ii) Use "static" keyword
    public static boolean climate(){
        return true;
        }
    }




