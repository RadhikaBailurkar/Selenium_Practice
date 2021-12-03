package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("D:\\Quastech\\testdata.xlsx");
		Thread.sleep(2000);
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
