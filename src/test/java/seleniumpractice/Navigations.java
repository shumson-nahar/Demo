package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Navigations {
	WebDriver driver;
	@Test
	public void navigation() {
		driver = new FirefoxDriver();
		driver.get("https://www.snapdeal.com");
		//driver.get("http://www.amazon.com");
		driver.navigate().to("http://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
