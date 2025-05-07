import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4_ParentChild {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> iterate = windows.iterator();
		String parentWindow = iterate.next();
		
		driver.switchTo().window(iterate.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		
		
	}

}
