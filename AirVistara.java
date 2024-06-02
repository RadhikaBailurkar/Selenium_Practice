package selenium_java_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AirVistara {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\\\Installers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.airvistara.com/in/en");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("acceptAllBtn")).click();
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='flightSearchTo']")).sendKeys("BOM");
		driver.findElement(By.id("onewaytrip")).click();
		driver.findElement(By.id("departCalendar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("passengers")).click();
		Thread.sleep(2000);
		int adult = 1;
		while(adult<5)
		{
			driver.findElement(By.id("adds_adult")).click();
			adult++;

		}
		driver.findElement(By.xpath("//button[@value='business']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.name("isSnrcitizen")).click();
		driver.findElement(By.className("passengerModalBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("book-flight-widget")).click();
		System.out.println(driver.findElement(By.id("passengers-error")).getText());
		Thread.sleep(2000);
		driver.findElement(By.id("passengers")).click();
		driver.findElement(By.id("subs_adult")).click();
        driver.findElement(By.xpath("//button[@value='premium-economy']")).click();
		//driver.findElement(By.cssSelector("input[name='friendsAndFamily'] span")).click();
		driver.findElement(By.className("passengerModalBtn")).click();
		Thread.sleep(2000);
		System.out.println( driver.findElement(By.id("discText")).getText());
		driver.close();
        
	}

}
