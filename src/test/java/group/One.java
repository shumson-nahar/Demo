package group;

import org.testng.annotations.Test;

public class One {
	@Test(groups = {"smoke"})
	public void testOneA() {
		System.out.println("Inside testOneA test of one Class");
	}
	@Test
	public void testOneB() {
		System.out.println("Inside test OneB test of One Class");
	}
	@Test
	public void testOneC() {
		System.out.println("Inside test OneC of One Class");
	}

}
