package chapter.collections;

/*
Create a generator class that produces character names (as String
objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
time you call next( ), and loops around to the beginning of the character list when it runs out
of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
LinkedHashSet, and a TreeSet, then print each container.
 */

import java.util.*;

public class Exercise4 {
    private String[] names = {"Tom", "Din", "Ostin", "Jack", "TJ", "Nick"};
    private int counter=0;
    public String next() {
        if(counter<names.length) {
            return names[counter++];
        }
        else {
            counter=0;
            return names[counter++];
        }
    }

    public static void main(String[] args) {
        Exercise4 ex = new Exercise4();
        String[] ar1 = new String[10];
        List<String> arl1 = new ArrayList<String>();
        List<String> linl1 = new LinkedList<String>();
        Set<String> hs1 = new HashSet<String>();
        Set<String> lhs1 = new LinkedHashSet<String>();
        Set<String> ts1 = new TreeSet<String>();

        for(int i=0; i<ar1.length; i++) {
            ar1[i] = ex.next();
        }

        Collections.addAll(arl1,ar1);
        Collections.addAll(linl1,ar1);
        Collections.addAll(hs1,ar1);
        Collections.addAll(lhs1,ar1);
        Collections.addAll(ts1,ar1);

        for(String st:arl1)
            System.out.println(st);
        System.out.println("===========");
        for(String st: hs1)
            System.out.println(st);
    }
}
