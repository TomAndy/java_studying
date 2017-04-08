package chapter.operators;

class Number {
    float fl;
}

public class Exercise3 {

    public static void f(Number nm) {
        nm.fl = (float)5.7;
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.fl = (float) 2.3;
        System.out.println("fl= " + number.fl );
        f(number);
        System.out.println("fl= " + number.fl);
    }
}
