import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\localadminuser\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// First Page- Form Filling
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		// Enter username and Password
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");

		// Select User
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.checkmark")));
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		// Alert Box Okay Button
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		// Select Option form static Dropdown
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select listItem = new Select(staticDropdown);
		listItem.selectByVisibleText("Consultant");

		// Check Terms and Condition and Submit Form
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		// Second Page
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h1.my-4")));

		// Adding Items to Cart
		List<WebElement> product = driver.findElements(By.cssSelector("button.btn.btn-info"));

		for (WebElement element : product) {
			element.click();
		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	}
}
