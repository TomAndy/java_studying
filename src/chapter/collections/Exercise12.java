package chapter.collections;

/*
Create and populate a List<Integer>. Create a second List<Integer>
of the same size as the first, and use ListIterators to read elements from the first List and
insert them into the second in reverse order.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {
    public static void main(String[] args) {
        Integer[] ar = {1,3,4,5,7};
        List<Integer> listIn = new ArrayList<Integer>(ar.length);
        Collections.addAll(listIn,ar);

        List<Integer> listIn2 = new ArrayList<Integer>(ar.length);
        ListIterator<Integer> lt = listIn.listIterator(ar.length);
        while(lt.hasPrevious()) {
            listIn2.add(lt.previous());
        }
        System.out.println(listIn2);
    }
}
