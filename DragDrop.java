//drap and drop actions on website
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		//box is on left hand side of website
		WebElement from = driver.findElement(By.id("box7"));
		
		//empty space on right hand side of website
		WebElement to = driver.findElement(By.id("box107"));
		
		//In this program, we have to move box on LHS to empty space on RHS, for that make use of Action class obj and drag and drop function
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		
		WebElement from2 = driver.findElement(By.id("box5"));
		WebElement to2 = driver.findElement(By.id("box105"));
		
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(from2, to2).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
