package chapter.controlling_execution;

public class Exercise4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n;i++) {
            int counter=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0) counter++;
            }
            if (counter==2) System.out.println(i);
        }
    }
}
