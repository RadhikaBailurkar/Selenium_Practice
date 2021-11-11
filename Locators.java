//Make use of Locators in Selenium
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		//webdriver - interface(methods)
		WebDriver driver = new FirefoxDriver();// class cum constructor
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		//locators = class name, id, name, xpath, partialtext, cssselector, tagname
		
		//driver.findElement(By.id("login1")).sendKeys("Radhika");
		//driver.findElement(By.id("password")).sendKeys("1234radhika");
		
		driver.findElement(By.name("login")).sendKeys("Radhika");
		driver.findElement(By.name("passwd")).sendKeys("1234radhika");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
