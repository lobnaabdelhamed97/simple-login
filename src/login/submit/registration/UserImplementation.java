package login.submit.registration ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UserImplementation implements UserInterface {

	

	static Connection conn;
	//The JDBC Statement, CallableStatement, and PreparedStatement interfaces define the methods and properties that enable you to send SQL commands 
	//and receive data from your database.
	//They also define methods that help bridge data type differences between Java and SQL data types used in a database.
	static PreparedStatement ps;
	
	
	
	@Override
	public int insertUser(Users u) {
  // flag to check if there is a new user or not
		int status =0;
		try {
			//get the connection
			conn=ConnectionProvider.getConn();
			//inserting in db by the sql command in "" where the table name is users
			ps=conn.prepareStatement("insert into users values(?,?,?,?,?)");
			//passing parameters
			ps.setString(1, u.getEmail());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getContact());
			ps.setString(4, u.getDOB());
			ps.setString(5, u.getUsername());
			ps.setString(6, u.getAddress());
			status= ps.executeUpdate();
			conn.close();
			
			
		}catch (Exception e){
			System.out.println(e);
		}

		return status;
	}

	@Override
	public Users getUsers(String userid, String password) {
       Users u = new Users();
       try {
    	 //get the connection
			conn=ConnectionProvider.getConn();
			//select the user from the db that matches the input  of user
			ps=conn.prepareStatement("select * from users where userid=? and password = ?");
			ps.setString(1, userid);
			ps.setString(2, password);
			
//			A ResultSet object maintains a cursor that points to the current
//			row in the result set. The term "result set" refers to the 
//			row and column data contained in a ResultSet object.

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u.setEmail(rs.getString(1));
				u.setPassword(rs.getString(2));
			}
			
       }catch (Exception e){
			System.out.println(e);
		}
		
		return null;
	}
	
	
}