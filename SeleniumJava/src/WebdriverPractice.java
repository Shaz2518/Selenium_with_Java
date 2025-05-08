import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Count of links in Webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limiting Scope of Webdriver in Webpage (Count of links in footer)
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Count of links in 1st Column in Footer
		WebElement colDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colDriver.findElements(By.tagName("a")).size());
		
		//Click on link and check if its working fine.
		int linkCount = colDriver.findElements(By.tagName("a")).size();
		for (int i =1; i<linkCount; i++)
		{
			colDriver.findElements(By.tagName("a")).get(i).click();
			driver.navigate().back();
		}
		 
		
	
	}

}
