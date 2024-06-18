public class Day7 {
    public static void main(String[] args) {
        Day7 m=new Day7();
        m.sayHello();
        m.addNumbers(10,11);
        m.multiplyNumber(23,54);
       int K=m.multiplyNumber(67,87);
    }
    void sayHello()
    {
        System.out.println("dendeti sai");
    }

    void addNumbers(int a, int b){
        System.out.println(a+b);
    }
    
    int multiplyNumber(int x ,int y){
        int K=x*y;
        return K;
    }


}
