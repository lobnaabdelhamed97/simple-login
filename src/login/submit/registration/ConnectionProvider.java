package login.submit.registration;

import java.sql.Connection ;
import java.sql.DriverManager;


public class ConnectionProvider implements  MyProvider{
	static Connection conn= null;
	public static Connection getConn(){
		
		try{
			//my connection driver
			Class.forName("com.mysql.jdbc.Driver");
			//get the connection 
			conn=DriverManager.getConnection(connurl, email, pass);
		}
		
		catch (Exception e){
			System.out.println(e);
		}
		return conn ;
		}
	}

	
	

