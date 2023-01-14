package day29collections;

import com.sun.source.tree.Tree;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets01 {

    /*
            1)Sets are for storing multiple non-primitive data in same data type.
            2)Sets are for storing unique data like e-mail addresses, SSN, Phone Numbers in a Country...
            3)There are 3 different Sets = i)HashSet: Uses "Hashing Technique".
                                                      It does not put the elements in any order.
                                                      HashSet accepts just a single "null" as element.

                                           ii)LinkedHashSet = Puts the elements in "Insertion Order"
                                           iii)TreeSet = Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in Strings)
                                               TreeSet is so slow in adding elements.
       Question: If you need to store "unique elements" in "natural order" which collections do you use?
               Answer will be "TreeSet"
       Question 2 = As you know, TreeSet is so slow in adding elements, how can you improve your code?
                    i)Create a HashSet
                    ii)Add element into the HashSet
                    iii)Convert HashSet to TreeSet
     */

    public static void main(String[] args) {

        //HashSet
        HashSet<String> emails = new HashSet<>();
        System.out.println(emails);//[]

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");//When you try to add repeated data, Java does not give any error and last data will be overwritten to the previous data.

        emails.add(null);//[null, Apple, Fig, Mango, Apricot, Orange]

        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]


        emails.remove("Fig");
        System.out.println(emails);//[null, Apple, Mango, Apricot, Orange]

        //emails.clear();//Deletes all element from the HashSet
        //System.out.println(emails);//[]

        //When you use "clone()" method, you can make data type "Object".
        Object emails2 = emails.clone();
        System.out.println(emails2);//[null, Mango, Apricot, Apple, Orange]

        HashSet<String> emails3 = (HashSet<String>) emails.clone();
        System.out.println(emails3);//[null, Mango, Apricot, Apple, Orange]


        //LinkedHashSet
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();

        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123]


        //TreeSet
        //1.Way
        long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();

        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        //nums1.add(null);//TreeSet does not accept "null" as element

        System.out.println(nums1);//[-5, 5, 17, 23, 41, 67]
        long middle = LocalTime.now().toNanoOfDay();


        //2.Way
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);
        //System.out.println(nums2);//[17, 67, -5, 5, 23, 41]

        TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);//[-5, 5, 17, 23, 41, 67]

        long ending = LocalTime.now().toNanoOfDay();


        System.out.println("1.Way: " + (middle - starting));
        System.out.println("2.Way: " + (ending - middle));









    }
}
