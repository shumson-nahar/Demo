package core_java;

public class Student1 {
	String name;
	int id;
	public Student1(String name ,int id) {
		this.id=id;
		this.name=name;
	
		
	}
	public void display() {
		System.out.println(id + " " +name);
	}

	public static void main(String[] args) {
		Student1 student = new Student1("Shumson",101);
				student.display();
		

	}

}
