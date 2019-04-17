package vehicle;

public class Car  extends Vehicle{

   public void drive() {
	drivable = new Drivable();
	drivable.drive();
   }
   
   public static void main(String... ar) {
	
	Car car = new Car();
	car.drive();
   }
}