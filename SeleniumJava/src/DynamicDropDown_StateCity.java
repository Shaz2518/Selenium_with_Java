import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropDown_StateCity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		driver.findElement(By.xpath("(//a[@value = 'MAA']) [2]")).click(); */
		
		
		
		// Using Parent-Child Method
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value ='BLR']")).click();
		driver.findElement(By.xpath("//div[@id ='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text ='Chennai']")).click();
		
		driver.findElement(By.className(".ui-state-default.ui-state-active")).click();
		

	}

}
