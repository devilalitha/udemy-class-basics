import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/flights");
		//first we select the date and see how can we click
		//grab the common atrritube and put it in the list and iterate
		driver.findElement(By.xpath("//input[@name='Departure-Date']")).click();
		while(!driver.findElement(By.xpath("//p[@class='QyCw']")).getText().contains("October"))
		{
			driver.findElement(By)
		}
		int count=driver.findElements(By.className("G2sL")).size();
		for(int i = 0;i<count;i++) {
			
			String Text=driver.findElements(By.className("G2sL")).get(i).getText();
			if(Text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.className("G2sL")).get(i).click();
				break;
			}
		}
		
		
		

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
