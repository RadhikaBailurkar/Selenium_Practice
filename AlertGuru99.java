package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertGuru99 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//ACCEPT
		//customer Id in demo website
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println("Alert msg: "+a.getText());
		
		Thread.sleep(3000);
		a.accept();
		Thread.sleep(3000);
		a.accept();
		Thread.sleep(3000);
		
		
		//DISMISS
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("456");
		driver.findElement(By.name("submit")).click();
		Alert b = driver.switchTo().alert();
		Thread.sleep(3000);
		b.dismiss();
		Thread.sleep(3000);
		driver.close();
	}

}
