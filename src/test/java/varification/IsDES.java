package varification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IsDES {
	WebDriver driver;
	@Test
	public void VerifyMethod() {
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement myAccountstore = driver.findElement(By.linkText("My Account"));
		System.out.println("Displayed status "+myAccountstore.isDisplayed());
		System.out.println("Displayed status "+myAccountstore.isEnabled());
		System.out.println("Displayed status "+myAccountstore.isSelected());
		
		
		
	}

}
