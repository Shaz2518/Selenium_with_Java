import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo_MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(50000);
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList'"));
		Actions mouseOver = new Actions(driver);
		
		//Move cursor to WebElement
		mouseOver.moveToElement(move).build().perform();
		
		//Move a cursor to search box and enter text in Caps.
		mouseOver.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();

	}

}
