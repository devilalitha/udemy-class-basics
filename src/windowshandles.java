import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
		Set<String>ids =driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid =it.next();
		String childid= it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());
			driver.switchTo().window(parentid);
		
	
	
		
		
	}

}
