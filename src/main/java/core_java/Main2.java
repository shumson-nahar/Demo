package core_java;

public class Main2 extends Person {

	public static void main(String[] args) {
		Main2 main = new Main2();
		main.sleep();
		main.eat();
		
		

	}

	@Override
	public void sleep() {
		System.out.println("person sleeping");
		
	}

}
