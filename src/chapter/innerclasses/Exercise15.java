package chapter.innerclasses;

/*
(2) Create a class with a non-default constructor (one with arguments) and
no default constructor (no "no-arg" constructor). Create a second class that has a method
that returns a reference to an object of the first class. Create the object that you return by
making an anonymous inner class that inherits from the first class.
 */

class B1 {
    public int i;
    B1(int i) {
        this.i=i;
    }
    B1() {
        i=3;
    }
}


public class Exercise15 {
    public B1 getRef() {
        return new B1(2){
            public int i;
        };
    }



}
