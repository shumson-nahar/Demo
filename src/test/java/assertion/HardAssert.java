package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	@Test
	public void sampleMethod() {
		System.setProperty("webdriver.chrome.driver",
			
		"C:\\Users\\Shumson Nahar\\eclipse-workspace2\\INTERVIEW\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Shumson Nahar\\Downloads\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String actualTitle= driver.getTitle();
		String expectedTitle = "Your Store";
		softassert.assertEquals(actualTitle,  expectedTitle);
		String actualURL= driver.getCurrentUrl();
		String expectedURL= "https://tutorialsninja.com/demo/";
		softassert.assertEquals(actualURL, expectedURL);
		driver.findElement(By.name("search")).sendKeys("HP",Keys.ENTER);
		//softassert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		softassert.assertAll();
		driver.quit();
		
		
	}
}


