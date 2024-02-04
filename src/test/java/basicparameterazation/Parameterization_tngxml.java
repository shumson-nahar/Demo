package basicparameterazation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_tngxml {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser","url","emailid","password"})
	public void SetUp(String Browser, String url,String emailid, String password) {
		if(Browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
			
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Farabi1234");
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		driver.quit();
	}

}
