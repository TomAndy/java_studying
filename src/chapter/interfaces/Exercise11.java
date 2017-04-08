package chapter.interfaces;

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

abstract class StringProcessor implements Processor{
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s = "If she weighs the same as a duck, she’s made of wood";
}

class Upcase extends StringProcessor {
    public String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }
}

class Swapp extends StringProcessor{
    public String process(Object st1) {
        String st=(String)st1;
        String sb="";
        if(st.length()==0 || st.length()==1) System.out.println(st);
        else {
            int a = st.length()/2;
            for(int i=0; i<a*2;i=i+2) {
                sb=sb + (st.charAt(i+1)) + (st.charAt(i));
            }
            if(st.length()%2!=0){
                sb=sb + (st.charAt(st.length() - 1));
            }
        }
        return sb;
    }
}

public class Exercise11 {
    public static void main(String[] args) {
//        Swapp.swapping("");
        Apply.process(new Upcase(),StringProcessor.s);
        Apply.process(new Swapp(),"abcde");
    }
}
