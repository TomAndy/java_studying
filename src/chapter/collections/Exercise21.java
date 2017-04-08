package chapter.collections;

/*
Using a Map<String,Integer>, follow the form of
UniqueWords.java to create a program that counts the occurrence of words in a file. Sort
the results using Collections.sort( ) with a second argument of
String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the
result.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Exercise21 {
    private String textToWork;

    public String getTextToWork()
    {
        return textToWork;
    }

    public void readFromFile(String path) {
        try {
            Scanner scanner = new Scanner( new File(path) );
            textToWork = scanner.useDelimiter("\\A").next();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        Exercise21 ex = new Exercise21();
        ex.readFromFile("d:/text2.txt");
        String[] text = ex.getTextToWork().split("\\W+");
        Map <String,Integer> map = new TreeMap<String, Integer>();
        for(String a:text) {
            Integer freq = map.get(a);
            map.put(a,freq ==null? 1:freq+1);
        }
        Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        set.addAll(map.keySet());

        Iterator it = set.iterator();
        while(it.hasNext()) {
            String st = (String)it.next();
            System.out.println(st+":  "+map.get(st));
        }

    }

}
