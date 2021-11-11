package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		//webdriver - interface(methods)
		WebDriver driver = new FirefoxDriver();// class cum constructor
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.get("https://www.reddit.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Radhika");
		driver.findElement(By.xpath("//a[@class='f12']")).click();
		
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
