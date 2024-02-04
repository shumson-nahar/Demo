package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindElementVsFindElements {
	WebDriver driver;
	@Test
	public void findElement() {
		 driver = new FirefoxDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 //findElement() ---> Return the Single EebElement
		 //1
		/* WebElement searchbox =  driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 
		searchbox.sendKeys("xyz");
		//2
		WebElement ele = driver.findElement(By.xpath("//div[@class ='footer-upper']//a"));
		System.out.println(ele.getText());
		//3
		
  WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(),'login')]"));*/
	
	//findElements() ---> Returns multiple webElement
		 //1
		List<WebElement> links= driver.findElements(By.xpath("//div[@class ='footer-upper']//a"));
		 
		 System.out.println("Number of elements captured:"+links.size());
		
		 //2
		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
	
		System.out.println(logo.size());
		for(WebElement ele:links) {
			System.err.println(ele.getText());
		}
		
	}
	

}
