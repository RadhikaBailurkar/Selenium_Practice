//------------------CODE NOT WORKING!!!----------------------
//second example for drog and drop
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//drag Sales into account box
		WebElement drag1 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop1 = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag1, drop1).build().perform();
		Thread.sleep(3000);
		
		//drag bank to account box
		WebElement drag2 = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop2 = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(drag2, drop2);
		Thread.sleep(3000);
	}

}
