package core_java;

public class MethodOverloading {
	static void myMethod(int x, int y) {
	System.out.println(x+y);
		
	}
	static void myMethod(double x , double y) {
		System.out.println(x+y);
			
		
	}

	public static void main(String[] args) {
		myMethod(2,3);
		myMethod(2.20,2.30);

	}

}
