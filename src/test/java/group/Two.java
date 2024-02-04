package group;

import org.testng.annotations.Test;

public class Two {
	@Test
	public void testTwoA() {
		System.out.println("Inside testTwoA test of one Class");
	}
	@Test(groups = {"smoke"})
	public void testTwoB() {
		System.out.println("Inside test testTwoAB test of One Class");
	}
	@Test
	public void testTwoC() {
		System.out.println("Inside test testTwoAC of One Class");
	}

}



