import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators_AfterLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Invoking Chrome Browser
		String userName = "Shaziya";
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
				
		//Implicit wait of 5econds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String passFinal = getPassword(driver);
				
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
				
		//Finding Username and Password
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(passFinal);
				
		//Click on Signing Button
		driver.findElement(By.className("signInBtn")).click();
		
		//Display text after successfull login
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		//Getting a username
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + userName + ",");
				
		//Logout and Close the Browser.
		driver.findElement(By.xpath("//*[text()='Log Out']"));
		driver.close();
		System.out.println("Successfully Logout");
	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String password = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = password.split("'");
		String finalPassword = passwordArray[1].split("'")[0];
		
		return finalPassword;
		
		
	}
}
