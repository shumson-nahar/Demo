package core_java;

public class Variables {
	static int var = 100;
	int var1 = 2000;
	

	public static void main(String[] args) {
		int local = 3000;
		System.out.println("This is a "+var);
		Variables var = new Variables();
		System.out.println("this is a "+var.var1);
		System.out.println("this is a localvar "+  local);
		
		

	}

}
