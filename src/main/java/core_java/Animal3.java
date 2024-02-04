package core_java;

public class Animal3 implements Animal1,Animal2 {

	public static void main(String[] args) {
		Animal3 animal= new Animal3();
		animal.animalBarking();
		animal.animalEating();
		animal.animalSound();
		animal.animalEating();
		animal.sleep();
		
	}

	@Override
	public void animalEating() {
		System.out.println("animal eating");
		
	}

	@Override
	public void animalBarking() {
		System.out.println("animal barking");
		
	}

	@Override
	public void animalSound() {
		System.out.println("animal sound");
		
	}

	@Override
	public void sleep() {
		System.out.println("animal sleep"); 
		
		// TODO Auto-generated method stub
		
	}

}
