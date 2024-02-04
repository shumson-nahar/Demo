package core_java;

public class Dog4 extends Animal4{
	String color="black";
	public void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		
		
	}
	public static void main(String[] args) {
		Dog4 dog = new Dog4();
		dog.printColor();
	}

}
