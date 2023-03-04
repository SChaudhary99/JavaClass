package March4thClass;

public class MathCal {

    public static final double pi = 3.14; //constant throughout the application as it is static and final

    public int sum(int a, int b){
        int c = a+b;
        return c;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public int sum(double a, double b){
        return (int)a+(int)b;       //example of changing datatype-->double converts into integer.
    }


}
