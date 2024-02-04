package core_java;

public class Finally {
	public static void test1() {
		System.out.println("my first test");
		System.out.println("my first test1");
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally block");
		}
		
		
	}
	

	public static void main(String[] args) {
		
		test1();
	}

}
