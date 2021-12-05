//in this eg, we call and read table created in MySQL and print on console
package Framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataDriven {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from login");
		
		//TO read all the records of the table use while loop
		while(rs.next()==true)
		{				//enter column label(name) to get data
			String un = rs.getString("un");
			String pd = rs.getString("password");
			System.out.println(un +" "+ pd);
		}
		
	}

}
