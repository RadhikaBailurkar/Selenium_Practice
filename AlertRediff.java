// Display alert box 
// the box is displayed when no input is provided and user clicks on submit button
package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertRediff {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//alert box on sign in button
		driver.findElement(By.name("proceed")).click();
		Alert a = driver.switchTo().alert();
		System.out.println("Alert msg: "+a.getText());
		
		Thread.sleep(4000);
		a.accept();
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
