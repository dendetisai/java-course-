public class Day15 {
class Vehicle{
        String brand="Ford";
        public void Company(){
            System.out.println("hord");
        }
    }
 class Car extends Vehicle{
  String modelname="must";
}
    public static void main(String[] args) {
        Day15 outer = new Day15();
        Car myCar = outer.new Car();
        System.out.println(myCar.brand);
        
    }
}

    

