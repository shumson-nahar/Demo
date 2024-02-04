package group;

import org.testng.annotations.Test;

public class Three {
	@Test
	public void testThreeA() {
		System.out.println("Inside testThreeA() test of one Class");
	}
	@Test
	public void testThreeB() {
		System.out.println("Inside test testThreeB test of One Class");
	}
	@Test(groups = {"smoke"})
	public void testThreeC() {
		System.out.println("Inside test testThreeC of One Class");
	}

}
