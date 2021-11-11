package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		//webdriver - interface(methods)
		WebDriver driver = new FirefoxDriver();// class cum constructor
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='qsb-keyword-sugg']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@id='qsb-keyword-sugg']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(4000);
		driver.close();
	}

}
