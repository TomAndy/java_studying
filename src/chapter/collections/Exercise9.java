package chapter.collections;

/*Modify innerclasses/Sequence.java so that Sequence works with an
Iterator instead of a Selector
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

interface Selector {
    boolean end();
    Object current();
    void next();
}
class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public Iterator getIterator () {
        List list = new ArrayList();
        Collections.addAll(list,items);
        Iterator it = list.iterator();
        return it;
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(4);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        Iterator it = sequence.getIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}