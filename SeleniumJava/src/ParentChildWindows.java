import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParentChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//Click on Child Window hyperlink
		driver.findElement(By.className("blinkingText")).click();
		
		Set <String> windows = driver.getWindowHandles();  //Get ParentID and Child ID
		Iterator <String> Iterate = windows.iterator(); //This will iterate to Windows
		String parentID = Iterate.next();
		String childID = Iterate.next();
		driver.switchTo().window(childID);
		
		//Grab text from Child Element
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		//Split the username from String
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String EmailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(EmailID);
	}

}
