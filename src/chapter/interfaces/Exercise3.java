package chapter.interfaces;

abstract class Printing {
    abstract void print( );
    Printing() {
        print();
    }
}

public class Exercise3 extends Printing {
    int i=2;
    public void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        exercise3.print();
    }
}

