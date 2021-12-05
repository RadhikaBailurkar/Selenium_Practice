// In this program, redirect table data values into website with username and password
package Framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {

	public static void main(String[] args) throws Throwable {
		
		//Checkpoint  ------redirect table data to websiter username and password
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from login");
		
		while(rs.next()==true)
		{				//enter column label(name) to get data
			
			System.setProperty("webdriver.gecko.driver", "D:\\Quastech\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			driver.manage().window().maximize();
			
			String un = rs.getString("un");
			String pd = rs.getString("password");
			//System.out.println(un +" "+ pd);
			driver.findElement(By.name("userName")).sendKeys(un);
			driver.findElement(By.name("password")).sendKeys(pd);
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(2000);
			
			//sign out 
			driver.findElement(By.linkText("SIGN-OFF")).click();
			
			Thread.sleep(2000);
			driver.close();
			
		}
	}

}
