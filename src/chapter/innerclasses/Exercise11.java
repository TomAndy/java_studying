package chapter.innerclasses;

/*
Exercise 11: (2) Create a private inner class that implements a public interface. Write
a method that returns a reference to an instance of the private inner class, upcast to the
interface. Show that the inner class is completely hidden by trying to downcast to it.
 */

public class Exercise11 {
    private class A2 implements Movement {
        public void move() {
            System.out.println("In inner class A2");
        }
    }
    Movement getRef() {
        return new A2();
    }

    public static void main(String[] args) {
        Exercise11 exercise11 = new Exercise11();
        //A2 a2 =  exercise11.getRef();
    }
}
