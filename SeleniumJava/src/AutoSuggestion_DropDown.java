import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ger");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //Store List of Menu Items in options
		
		for (WebElement option : options) //Check each option in options
		{
			if(option.getText().equalsIgnoreCase("Germany")) //Compare with expected results
			{
				option.click();
				break;
			}
		}
	}

}
