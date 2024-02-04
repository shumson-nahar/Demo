package core_java;

public class TestPolymorphism {

	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("SBI Rate of Interest:"+b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate Of Interest"+b.getRateOfInterest());
		b = new AXIS();
		System.out.println("Axis Rate Of Interes "+b.getRateOfInterest());

	}

}
