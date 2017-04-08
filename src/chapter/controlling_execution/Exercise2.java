package chapter.controlling_execution;

public class Exercise2 {
    public static void comparator(int a, int b) {
        if (a>b) System.out.println("a= "+a+"; b= "+b+   "; a is greater than b");
        else if (a<b) System.out.println("a= "+a+"; b= "+b+   "; a is less than b");
        else System.out.println("a= "+a+"; b= "+b+   "; a=b");
    }

    public static void main(String[] args) {
        int [] digits = new int [25];
        for(int i=0; i<25; i++) {
            digits[i] = (int)Math.round(Math.random()*100);
        }
        for(int i=0;i<digits.length-1;i++)
            comparator(digits[i],digits[i+1]);
    }
}
