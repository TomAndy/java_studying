package chapter.exceptions;

/*
Create your own exception class using the extends keyword. Write a
constructor for this class that takes a String argument and stores it inside the object with a
String reference. Write a method that displays the stored String. Create a try-catch clause
to exercise your new exception.
 */

class MyException extends Exception {
    private String exception;
    public MyException(String st) {
        super(st);
        exception = st;
    }
    public void getException() {
        System.out.println(exception);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        try {
            throw new MyException("Hello");
        } catch (MyException e) {
            System.out.println("In catch clause");
            e.getException();
        }
    }
}
