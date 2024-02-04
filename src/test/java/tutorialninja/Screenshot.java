package tutorialninja;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	WebDriver driver;
	@Test
	public void registerAccountUsingInvalidEmailAddress() throws IOException {
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://tutorialsninja.com/demo/");
	 WebElement myAccountDropmenu = driver.findElement(By.linkText("My Account"));
	 myAccountDropmenu .click();
	 WebElement registerOption = driver.findElement(By.linkText("Register"));
	 registerOption.click();
	 WebElement firstNameField = driver.findElement(By.id("input-firstname"));
	 firstNameField.sendKeys("shumson");
	 WebElement lastNameField = driver.findElement(By.id("input-lastname"));
	 lastNameField.sendKeys("Nahar");
	 WebElement emailField = driver.findElement(By.id("input-email"));
	 emailField.sendKeys("shum");
	 WebElement telephoneField= driver.findElement(By.id("input-telephone"));
	 telephoneField.sendKeys("2676001308");
	 WebElement passwordField = driver.findElement(By.id("input-password"));
	 
	 passwordField.sendKeys("Farabi1234");
	 WebElement confirmField = driver.findElement(By.id("input-confirm"));
	 confirmField.sendKeys("Farabi1234");
	 WebElement privacyPolicy = driver.findElement(By.name("agree"));
	 privacyPolicy.click();
	 WebElement continueButton = driver.findElement(By.cssSelector("input.btn-primary"));
	 continueButton.click();
	 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(srcFile, new File("Screenshot//one.png"));
	 
	 driver.quit();
		
	}
	

}
