import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		WebDriverWait d= new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated();
		
		driver.switchTo().alert().accept();
		
		

	}

}
