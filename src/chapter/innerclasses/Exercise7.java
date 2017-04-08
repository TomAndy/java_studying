package chapter.innerclasses;

/*
Exercise 7: (2) Create a class with a private field and a private method. Create an
inner class with a method that modifies the outer-class field and calls the outer-class method.
In a second outer-class method, create an object of the inner class and call its method, then
show the effect on the outer-class object.
 */

public class Exercise7 {
    private int i=0;
    private void pr() {
        System.out.println("In class A1");
    }
    public void f() {
        A1 a1 = new A1();
        a1.modifier();
    }

    class A1 {
        public void modifier() {
            i++;
            System.out.println(i);
            pr();
        }
    }


    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        exercise7.f();
    }
}
