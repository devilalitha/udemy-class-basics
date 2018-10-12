import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElements(By.xpath("//input[@name='group1']")).size();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text =="cheese")
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				
			}
			
			
		}
	}

}
