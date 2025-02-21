import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_FormFilling {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Entering Data
		driver.findElement(By.xpath("//input[@name ='name']")).sendKeys("Shaziya");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shaziyashaikh2518@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Shaz123");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		//Selecting Static Dropdown
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02/25/1997");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.className("alert")).getText());
	}

}
