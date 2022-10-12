package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {


        //Example 1: Type code to remove the first occurrence of a specific element from a String List
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        //To remove first occurrence Java created a method which is "remove" method.

        List<String> f = new ArrayList<>();
        f.add("Shoes");
        f.add("TV");
        f.add("Radio");
        f.add("Laptop");
        f.add("Shoes");
        f.add("Book");
        f.add("Shoes");
        System.out.println(f);

        f.remove("Shoes");
        System.out.println(f);

        //Example 1: Type code to remove all occurrence of a specific element from a String List
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        List<String> e = new ArrayList<>();
        e.add("Shoes");
        e.add("TV");
        e.add("Radio");
        e.add("Laptop");
        e.add("Shoes");
        e.add("Book");
        e.add("Shoes");

        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("Laptop");

        e.removeAll(c);
        System.out.println(e);

        //Example 3: Type code to remove an element at a specific index
        //  ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"] remove the 5th element

        List<String> p = new ArrayList<>();
        p.add("Shoes");
        p.add("TV");
        p.add("Radio");
        p.add("Laptop");
        p.add("Shoes");
        p.add("Book");
        p.add("Shoes");

        p.remove(4);
        System.out.println(p);

        //Example 4: Create an Integer List, then remove the 4th element.

        List<Integer> d = new ArrayList<>();
        d.add(12);
        d.add(4);
        d.add(13);
        d.add(25);
        d.add(432);
        System.out.println(d);

        d.remove(3);
        System.out.println(d);

        //Example 4: Create an Integer List, then remove the first occurrence of 4
        List<Integer> o = new ArrayList<>();
        o.add(12);
        o.add(4);
        o.add(13);
        o.add(25);
        o.add(432);
        System.out.println(o);

        o.remove(Integer.valueOf(4));
        System.out.println(o);

        //Note: If you use Integer List element directly inside the remove() method lik remove(4), Java will accept it as index,
        //Because indexes are primitive integers, when you put 4, it will be accepted as primitive, and it will be indexed.
        //Lists use non-primitives as list elements, therefore you have to convert primitive int to Integer.
        //To do that, use valueOf() method from Integer wrapper class

        //Example 6: Type a code to check if a specific element exists in the list or not.

        List<Double> g = new ArrayList<>();

        g.add(12.99);
        g.add(5.02);
        g.add(11.23);

        boolean isExist = g.contains(5.02);
        System.out.println(isExist);

        //Example 7: Type code to change the element at index 1 to 9.99

        List<Double> h = new ArrayList<>();

        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        System.out.println(h);

        h.set(1, 9.99);
        System.out.println(h);

        //Example 8: Type code to increase all salaries 10 percent in an Integer List
        //        [5000, 6000, 4500, 3900, 7200]


        List<Double> salary = new ArrayList<>();
        salary.add(5000.0);
        salary.add(6000.0);
        salary.add(4500.0);
        salary.add(3900.0);
        salary.add(7200.0);


        for (int i = 0; i<salary.size(); i++){

            salary.set(i, salary.get(i)*1.1);
        }
        System.out.println(salary);

        //How to check if two Lists are same or not

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        if (m.equals(n)) {
            System.out.println("The lists are same");
        } else {
            System.out.println("The lists are not same");
        }

        //How to check if a List contains multiple elements
        // [12, 23, 32, 14, 24, 56] ==> Check if the list has 23, 56, and 24

        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(23);
        numbers.add(32);
        numbers.add(14);
        numbers.add(24);
        numbers.add(56);

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(23);
        numbers2.add(56);
        numbers2.add(24);

        boolean areExist = numbers.containsAll(numbers2);
        System.out.println(areExist);



















    }
}
