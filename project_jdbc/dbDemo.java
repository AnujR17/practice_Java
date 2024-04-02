package project_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class dbDemo {	
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connection succesfull");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Mysql@123");
		Statement st = con.createStatement();
		// insert
		//st.executeUpdate("insert into emp (id, eName, Dept, salary) values (2,'Anuj', 'Java', '30000'), (3,'Anuj', '.Net', '25000'), (4,'Anuj', 'MERN', '35000')");
		System.out.println("success the row inserted.");
		//update 
		//st.executeUpdate("update emp set eName = 'Ruchir' where id = 3");
		System.out.println("Updated");
		//delete
		//st.executeUpdate("delete from emp where id = 4");
		System.out.println("Deleted");
		// select 
		ResultSet rs =st.executeQuery("select * from emp");
		
		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getBigDecimal(4));
			System.out.println(rs.getInt(1)+ " " + rs.getString(2)+  " " +rs.getString(3)+ " " +rs.getBigDecimal(4));
		}
	}	
}

