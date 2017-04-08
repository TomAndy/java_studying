package chapter.collections;

/*
Create an empty LinkedList<Integer>. Using a Listlterator, add
Integers to the List by always inserting them in the middle of the List
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator lt;
        for(int i=0; i<6; i++) {
            lt = list.listIterator(list.size()/2);
            lt.add(i);
        }

        System.out.println(list);
        System.out.println(list.size());
    }
}
