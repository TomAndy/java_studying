package chapter.controlling_execution;

public class Exercise9 {
    public static void fibonachi(int a) {
        String res = "";
        int fibonNumber=1, fibo1=1, fibo2=1;
            if (a < 1) {
                System.out.println("no fibonachi numbers");
            }
            else if (a == 1 || a==2) {
                res = res + 1;
                System.out.println(res);
            }
            else {
                System.out.println(1);
                System.out.println(1);
                for(int i=3; i<=a;i++) {
                    fibonNumber = fibo1+fibo2;
                    fibo1=fibo2;
                    fibo2=fibonNumber;
                    System.out.println(fibonNumber);
                }

            }
    }

    public static void main(String[] args) {
        fibonachi(6);
    }
}
