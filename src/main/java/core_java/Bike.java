package core_java;

public class Bike extends Vehicle{
	public void run() {
		System.out.println("Bike running");
	}

	public static void main(String[] args) {
		Vehicle vehicl = new Vehicle();
		Bike bike = new Bike();
		bike.run();
		vehicl.run();
		
		

	}

}
