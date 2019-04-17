package vehicle;

public class Flight extends Vehicle{ 
   public void fly() {
	flyable = new Flyable();
	flyable.fly();
   }
   
    public static void main(String... ar) {
	
	 Flight flight = new Flight();
	flight.fly();
   }
}