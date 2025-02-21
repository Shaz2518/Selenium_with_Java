import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

public class AddToCart_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver",
				"C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// Hitting URL

		// Adding Single Item to Cart
		/*
		 * List<WebElement> products =
		 * driver.findElements(By.cssSelector("h4.product-name")); for (int i = 0; i <
		 * products.size(); i++) { String names = products.get(i).getText(); if
		 * (names.contains("Cucumber")) {
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * ); break; } }
		 */

		// Adding Multiple Item to Cart
		int j=0;
		String veggies[] = { "Brocolli", "Cucumber", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String names[] = products.get(i).getText().split("-");
			String newName = names[0].trim();

			List veggiesNeeded = Arrays.asList(veggies);

			if (veggiesNeeded.contains(newName)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==3)
				{break;}

			}
		}

	}

}
