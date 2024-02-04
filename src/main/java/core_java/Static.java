package core_java;

public class Static {
	public static void myStatic() {
		System.out.println("Hello world");
	}
	public void myNonstatic() {
		System.out.println("Nonstatic method");
	}

	public static void main(String[] args) {
		myStatic();
		Static s = new Static();
		s.myNonstatic();
		

	}

}
