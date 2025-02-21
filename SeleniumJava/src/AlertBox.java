import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver",
				"C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// Hitting URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*
		 * //Alert Button driver.findElement(By.id("name")).sendKeys("Shaziya");
		 * driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		 * 
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 */

		// Confirm Button
		// driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Shaziya");
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
