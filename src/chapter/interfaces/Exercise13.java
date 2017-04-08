package chapter.interfaces;

interface A1 {
    public void fly();
}

interface B1 extends A1 {
    public void move();
}

interface B2 extends A1 {
    public void run();
}

interface C extends B1,B2 {
    public void stay();
}

public class Exercise13 {
}
