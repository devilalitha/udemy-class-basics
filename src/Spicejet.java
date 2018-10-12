import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='IXM'])[2]")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		
		
		
		
		
		
		

	}

}
