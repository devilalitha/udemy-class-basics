import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
			driver.findElement(By.cssSelector("#nav-your-amazon")).click();
			driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("8328427780");
			driver.findElement(By.cssSelector("input[id='continue']")).click();
			driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("Lalli@1995");
			driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
	}

}
