import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatersDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Chrome Browser
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Implicit wait of 5econds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Finding Username and Password
		driver.findElement(By.id("inputUsername")).sendKeys("Shaziya");
		driver.findElement(By.name("inputPassword")).sendKeys("Shaz");
		
		//Click on Signing Button
		driver.findElement(By.className("signInBtn")).click();
		
		//Display Output in Console
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Click forget password using Link Text Locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Fill Form using XPATH and CSS Selector
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shaz");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shaziyashaikh2518@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("shaikh@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Shaziya@gmail");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9898989822");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//System.out.println("New Password Is: " + newPassword);
		
		//Go to Login again and fill form.
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Shaziya");
		driver.findElement((By.cssSelector("input[type*='pass'"))).sendKeys("rahulshettyacademy");
		driver.findElement((By.id("chkboxOne"))).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		

	}

}
