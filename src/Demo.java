import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "I:\\eclipse orginal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("#email")).sendKeys("abcde");
		driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
		driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
	}}