package core_java;

public class Car {
	int mod;
	int wheel;
	static String name;

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		a.mod=2015;
		a.wheel= 4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=2012;
		
		name="shima";
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println(name);
		
				
				
		

	}

}
