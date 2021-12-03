// Find the total number of links present on the website
package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
		driver.manage().window().maximize();

		//Create a list obj to store all the tags<a>
		List <WebElement> ls = driver.findElements(By.tagName("a"));
		int size = ls.size();
		
		System.out.println("Total links: "+size);
		//op: Total links = 110
		
		//Display the texts on all links
		for(int i = 0;i < size; i++)
		{
			System.out.println(ls.get(i).getText());
		}
		
		//Eg: Orchid Arrangements Beverly Hills, Orchid Arrangements Koreatown,Orchid Arrangements Downtown LA
	}

}
