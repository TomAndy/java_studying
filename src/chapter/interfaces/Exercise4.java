package chapter.interfaces;

abstract class A {
    abstract void m1();
}

class B extends A {
    public void m1() {
        System.out.println("Class B");
    }
    public static void m2(A obj) {
        obj.m1();
    }
}

public class Exercise4 extends A{
    public void m1() {
        System.out.println("Class Exercise4");
    }
    public static void m2(A instance) {
//        Exercise4 exercise4 = (Exercise4)instance;
//        exercise4.m1();
        instance.m1();
    }

    public static void main(String[] args) {
        Exercise4.m2(new Exercise4());
        B.m2(new B());
    }
}
