package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement {
	public WebDriver driver;

	@Test
	public void sampleMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			
		"C:\\Users\\Shumson Nahar\\eclipse-workspace2\\INTERVIEW\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Shumson Nahar\\Downloads\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement contentLink = driver.findElement(By.linkText("My Account"));
		Actions action = new Actions(driver);
		action.moveToElement(contentLink).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		//driver.quit();
		
		

}
}
