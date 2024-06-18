class Bike{
    void run(){
        System.out.println("RUNNING");
    }

    }
    class pulsar extends Bike{
        void run(){
            System.out.println(" runs safely with 90km");
        }
    }
public class overiding {
    public static void main(String[] args) {
        Bike B=new pulsar();
        Bike C=new Bike();
        B.run();
        C.run();
    }
    
}
