package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window();
		
							// skills textbox
		WebElement textbox1 = driver.findElement(By.xpath("//input[@id='qsb-keyword-sugg']"));
							//Location textbox
		WebElement textbox2 = driver.findElement(By.xpath("//input[@id='qsb-location-sugg']"));
		Actions act = new Actions(driver);
		
		//Uppercase tester in skills textbox
		act.keyDown(textbox1, Keys.SHIFT).sendKeys("tester").build().perform();
		
		//Uppercase mumbai in location textbox
		act.keyDown(textbox2, Keys.SHIFT).sendKeys("mumbai").build().perform();
		
		act.contextClick(textbox2).perform();
		
		//Alternate solution
		//act.keyDown(textbox2, Keys.SHIFT).sendKeys("mumbai").keyUp(textbox2,Keys.SHIFT).contextClick().perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}
