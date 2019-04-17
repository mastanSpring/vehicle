package vehicle;

public class Vehicle {
   
   IDrivable drivable;
   IFlyable flyable;

   public void honk() {
	System.out.println("Honk Method In Vehicle");
   }
}