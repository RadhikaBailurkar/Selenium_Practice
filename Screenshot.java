import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
		driver.manage().window().maximize();
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		
		File scrfile = scr.getScreenshotAs(OutputType.FILE);
		//for fileutil error you have to download "https://commons.apache.org/proper/commons-io/"
		//click-> download_io.get
		//unzip it and open eclipse, right click on project-> build path-> configure buildpath-> add external jars
		
		//select all the available jars in commons io file and click apply
		
									//enter file location to save screenshot and also give screenshot name
		FileUtils.copyFile(scrfile, new File("D:\\Quastech\\Screenshot\\SS1.png"));
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
