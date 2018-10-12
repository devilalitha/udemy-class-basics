import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//try to get the links count on the page		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//get me the count of links in footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//get the count of links in first column
		WebElement cldriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(cldriver.findElements(By.tagName("a")).size());
		
		//click on each link and check if the windows are opening
		int count = cldriver.findElements(By.tagName("a")).size();
		for(int i = 1;i<count;i++) {
			
			String clickon=Keys.chord(Keys.CONTROL, Keys.ENTER);
			cldriver.findElements(By.tagName("a")).get(i).sendKeys(clickon);
		}
			Set<String> win=driver.getWindowHandles();
			Iterator<String> it=win.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
			
		}
		
	
}
