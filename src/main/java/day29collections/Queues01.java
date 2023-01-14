package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    /*
            1)Queue's are for storing multiple non-primitive data in the same data type.
            2)Queue's are used for FIFO(First In First Out)
     */

    public static void main(String[] args) {

        Queue<String> warehouse = new LinkedList<>();

        warehouse.add("Milk");
        warehouse.add("Meat");
        warehouse.add("Bread");
        warehouse.add("Honey");
        warehouse.add("Tomatoes");

        System.out.println(warehouse);//[Milk, Meat, Bread, Honey, Tomatoes]

       String element1 = warehouse.poll();//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        //Returns the head of this queue, or null if this queue is empty
        System.out.println(element1);//Milk
        System.out.println(warehouse);//[Meat, Bread, Honey, Tomatoes]

        String element2 = warehouse.peek();//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //Returns the head of this queue, or null if this queue is empty
        System.out.println(element2);//Meat
        System.out.println(warehouse);//[Meat, Bread, Honey, Tomatoes]

        String element3 = warehouse.element();//Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        System.out.println(element3);//Meat
        System.out.println(warehouse);//[Meat, Bread, Honey, Tomatoes]

        Queue<String> emptyWareHouse = new LinkedList<>();

        String element4 = emptyWareHouse.peek();
        System.out.println(element4);//null

        //String element5 = emptyWareHouse.element();//If the Queue is empty, "element()" method throws "NoSuchElementException"
        //System.out.println(element5);

        /*
            Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
            When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
            Returns: true if the element was added to this queue, else false
            Throws:
            ClassCastException – if the class of the specified element prevents it from being added to this queue
            NullPointerException – if the specified element is null and this queue does not permit null elements
            IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */

        boolean result1 = warehouse.offer("Chocolate");
        System.out.println(result1);//true
        System.out.println(warehouse);//[Meat, Bread, Honey, Tomatoes, Chocolate]
 /*
            Retrieves and removes the head of this queue.
            This method differs from poll() only in that it throws an exception if this queue is empty.
            Returns: the head of this queue
            Throws: NoSuchElementException – if this queue is empty
         */


        String element6 = warehouse.remove();
        System.out.println(element6);//Meat
        System.out.println(warehouse);//[Bread, Honey, Tomatoes, Chocolate]

        String element7 = emptyWareHouse.poll();
        System.out.println(element7);//null

        //String element8 = emptyWareHouse.remove();//NoSuchElementException
        //System.out.println(element8);




    }
}
