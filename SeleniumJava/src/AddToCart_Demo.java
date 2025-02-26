import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

public class AddToCart_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver",
				"C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// Adding Multiple Item to Cart
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int j = 0;
		String veggies[] = { "Brocolli", "Cucumber", "Carrot", "Beetroot", "Almonds", "Pista" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String names[] = products.get(i).getText().split("-");
			String newName = names[0].trim();

			List veggiesNeeded = Arrays.asList(veggies);

			if (veggiesNeeded.contains(newName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == veggies.length) {
					break;
				}
			}
		}
	}
}
