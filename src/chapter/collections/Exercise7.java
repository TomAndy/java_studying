package chapter.collections;

/*Create a class, then make an initialized array of objects of your class. Fill
a List from your array. Create a subset of your List by using subList( ), then remove this
subset from your List.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A {
    private static int i;
    private final int n = i++;
    public int id() {
        return n;
    }
}
public class Exercise7 {

    public static void main(String[] args) {
        A[] arr = new A[5];
        for(int i=0; i<arr.length;i++) {
            arr[i] = new A();
        }

        List<A> list = new ArrayList<A>();
        Collections.addAll(list, arr);
        List<A> subset = list.subList(1,3);

        list.removeAll(subset);
        for(A aa: list) {
            System.out.println(aa.id());
        }
    }

}
