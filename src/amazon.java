import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		/*Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).click().build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ap_email")).sendKeys("123");*/
		
		
		Actions a= new Actions(driver);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().sendKeys(keys)
		driver.switchTo().defaultContent();
				

	}
	

}
