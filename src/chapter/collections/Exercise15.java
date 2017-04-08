package chapter.collections;

/*
Stacks are often used to evaluate expressions in programming languages.
Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push
the following letter onto the stack," and’-’ means "pop the top of the stack and print it":
"+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */

public class Exercise15 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        String str = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='+') {
                st.push(Character.toString(str.charAt(i+1)));
            }
            else if(str.charAt(i)=='-') {
                System.out.println(st.pop());
            }
        }
    }
}
