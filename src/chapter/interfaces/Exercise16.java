package chapter.interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CharGenerator implements Readable{
    private int count;
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1; // Indicates end of input
        Random rand = new Random();
        for(int i=0;i<5; i++) {
            cb.append((char)(rand.nextInt(26) + 'a'));
        }
        cb.append("\n");
        return 5;
    }
    CharGenerator(int count) {
        this.count=count;
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(new CharGenerator(3));
        while(ss.hasNext()) {
            System.out.println(ss.next());
        }
    }
}
