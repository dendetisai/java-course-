class Maths{
    static int calculate (int a,int b){
        return a*b;
    }
    static double calculate ( double a,double b){
        return a*b;
    }
}
public class overloading {
    public static void main(String[] args) {
        System.out.println(Maths.calculate(10,76));
        System.out.println(Maths.calculate(1.0,6.0));
    }
    
}
