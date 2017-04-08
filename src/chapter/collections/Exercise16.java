package chapter.collections;

/*
Create a Set of the vowels. Working from UniqueWords.Java, count
and display the number of vowels in each input word, and also display the total number of
vowels in the input file
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Exercise16 {
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
        Exercise16 ex = new Exercise16();
        ex.readFromFile("D:/text2.txt");
        String[] text = ex.getTextToWork().split("\\W+");
        String[] vowels ={"q","w","r","t","y","p","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        Set<String> set = new TreeSet<String>();
        Collections.addAll(set,vowels);
        System.out.println(set);
        for(String a:text) {
            int counter=0;
            for(int i=0; i<a.length();i++) {
                if(set.contains(Character.toString(a.charAt(i)))) {
                    counter++;
                }
            }
            System.out.println(a+":  "+counter);

        }

    }
}
