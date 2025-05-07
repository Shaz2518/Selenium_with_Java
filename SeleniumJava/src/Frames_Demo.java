import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //Switch to Frames
		
		//driver.findElement(By.id("draggable")).click();  
		
		//Drag and Drop in Frames using Action Class
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions dragDrop = new Actions(driver);
		dragDrop.dragAndDrop(source, target).build().perform();
		
		
		
		
	}

}
