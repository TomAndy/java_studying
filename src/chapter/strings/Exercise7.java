package chapter.strings;

/*
Using the documentation for java.util.regex.Pattern as a resource,
write and test a regular expression that checks a sentence to see that it begins with a capital
letter and ends with a period.
 */

public class Exercise7 {
    public static void main(String[] args) {
        String st = "Hey, how are you";
        System.out.println(st.matches("^[A-Z].*\\.$"));
    }
}
