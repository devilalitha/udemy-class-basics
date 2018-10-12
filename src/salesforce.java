import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		
			System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("abcde");
			driver.findElement(By.id("pass")).sendKeys("1234");
			driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();

	}
}
