abstract class pulsar{
    public pulsar void gear();
    public void speed(){
        System.out.println("180");
    }
    class scooty extends pulsar{
        public void speed(){
            System.out.println("100");
        }
    }
}
 class main() {
    public static void main(String[] args) {
        Bike myBike=new Bike();
        myBike.speed();
        myBike.speed();
    }
    
}
