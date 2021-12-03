//Inspect on Radio Button
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		
		//Inspect yes radio button
		driver.findElement(By.id("yes")).click();
		Thread.sleep(2000);
		
		//Inspect check button
		driver.findElement(By.id("buttoncheck")).click();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
