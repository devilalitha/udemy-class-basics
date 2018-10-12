import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auosugestivedropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
				
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
			if(i>10) {
				System.out.println("element not found");
			}
			else
			{
				System.out.println("Element is found");
			}
		}
		//if we dont find any option which is present in while loop, the loop will run infinte times and we should stop
		//consider the app has 10 dropdowns, so if we dont find the desired in 10 drop downs then
		
		//we can user if statement to break the loop
		
		
		
		
		

	}

}
