package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioCheckboxDemo {
	public WebDriver driver;
	@Test
	public void checkBox() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		driver.findElement(By.id("yes")).click();
		WebElement  yesRadioButton =driver.findElement(By.id("one"));
		yesRadioButton.click();
		
		WebElement noRadioButton = driver.findElement(By.id("two"));
		//noRadioButton.click();
		boolean yesStatus = yesRadioButton.isSelected();
		boolean noStatus =noRadioButton.isSelected(); 
		if(yesStatus ) {
			if(noStatus) {
				System.out.println("Failed");
			
			
		}
		}
		noRadioButton.click();
		yesStatus = yesRadioButton.isSelected();
		noStatus =noRadioButton.isSelected(); 
		if(yesStatus) {
			if(noStatus) {
				System.out.println("Failed");
				
			}
		}
		WebElement yButton = driver.findElement(By.id("nobug"));
		WebElement nButton = driver.findElement(By.id("bug"));
		 yButton.click();
		 nButton.click();
		 if(yButton.isSelected() && nButton.isSelected()) {
			 System.out.println("Bug Found"); 
			 
		 }
		WebElement foButton =  driver.findElement(By.id("foo"));
		WebElement barButton = driver.findElement(By.id("notfoo"));
		if(foButton.isSelected()) {
			System.out.println("foo selected"); 
		
		}else if(barButton.isSelected()) {
			System.out.println("bar is in selected state ");
		}
		WebElement mayBeRadioButton = driver.findElement(By.id("maybe"));
		if(mayBeRadioButton.isEnabled()) {
			System.out.println("mayBeRadioButton is in enabled state");
		}else {
			System.out.println("mayBeRadioButton is in disabled state");
		}
		driver.quit();
	}
	}



