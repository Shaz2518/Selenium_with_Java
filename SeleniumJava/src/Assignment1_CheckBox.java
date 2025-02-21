import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1_CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Before Click " + driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println("After Click " + driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println("After Uncheck " + driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Count of No. of checkboxes.
		
		System.out.println("Number of Checkboxes " + driver.findElements(By.cssSelector("input[type='checkbox'")).size());
		
	}

}
