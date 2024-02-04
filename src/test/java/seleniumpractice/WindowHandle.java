package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
	@Test(enabled=false)
	public void windowHandle() {
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		String windowID = driver.getWindowHandle();//Return ID of the single browser window
		System.out.println( windowID);
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		Set<String> windowIDs = driver.getWindowHandles();//return ID's of multiple browser windows
	Iterator<String> it = windowIDs.iterator();
	String parentWindowID = it.next();
	String childWindowID = it.next();
	System.out.println("parent window ID :"+parentWindowID);
	System.out.println("child window ID:"+childWindowID );
	
		
		driver.quit();
	
	}

}
