import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EndToEnd_SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.msedge.driver","C:\\Users\\localadminuser\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Selecting From and To City
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value = 'DEL']")).click();
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   


		//driver.findElement(By.xpath("//a[@value='HYD'][2]")).click(); 
		
		//driver.findElement(By.className(".ui-state-default.ui-state-active")).click();
		
		//Selecting Adult
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println("Before Click " + driver.findElement(By.id("divpaxinfo")).getText());
		int i= 1;
			while(i<5)
			{	
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
			}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("After Click " + driver.findElement(By.id("divpaxinfo")).getText());
		
		//Checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	}

}
