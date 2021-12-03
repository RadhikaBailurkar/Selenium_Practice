//Alert box actions
package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQA {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		
		//Click Button to see alert 
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert a = driver.switchTo().alert();
		
		Thread.sleep(4000);
		a.accept();
		Thread.sleep(4000);
		driver.close();
		//On button click, alert will appear after 5 seconds 
		
	}

}
