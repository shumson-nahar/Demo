package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Assertion {
	@Test(enabled = false)
	public void ParameterA() {
		String actual = "My channel is about Automation";
		String expected = "My channel is about Automation";
		//Assert.assertEquals(actual, expected);
		Assert.assertTrue(true!= false);
		Assert.fail("i am delivelertely failing the testcase");
				
	}

}
