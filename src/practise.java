import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//a[@title='Bus']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[2]/div/div[1]/div/div[2]/h1")).getText());
		driver.findElement(By.xpath("//input[@id='text-box']")).sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@id='text-box'])[2]")).sendKeys("banglore");
		
	}
}
	
	
	

