package chapter.collections;

/*
Modify the previous exercise so that it uses a class containing a String
and a count field to store each different word, and a Set of these objects to maintain the list
of words
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Words {
    private String word;
    private int counter;
    public Words(String word, int counter) {
        this.word=word;
        this.counter=counter;
    }
}

public class Exercise22 {
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
        Set<Words> set = new HashSet<Words>();
        for(int i=0; i<text.length-1;i++) {
            if(text[i].equals(""))
                continue;
            else {
                int count=1;
                for(int j=i+1;j<text.length;j++) {
                    if(text[i].equals(text[j])) {
                        count++;
                        text[j]="";
                    }
                }
                set.add(new Words(text[i],count));
            }
        }
        System.out.println(set);
    }
}
