import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	for(int i=0;i<count;i++) {
	String values=	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int valueint=Integer.parseInt(values);
	sum=sum + valueint;
	}
	System.out.println(sum);
	String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int Extrasvalue=Integer.parseInt(Extras);
	int Total=sum+Extrasvalue;
	System.out.println(Total);
	
	
		
	}

	
}
