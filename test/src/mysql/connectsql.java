package mysql;

import java.sql.*;

public class connectsql {
	public static void main(String[] args) throws Exception {
	String user = "root";
	String password = "5532889";
	String url = "jdbc:mysql://localhost:3306/my?useSSL=false";
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection(url,user,password);
		Statement state = connect.createStatement();
		state.execute("INSERT INTO  mytable values(2,'Mr wang2',25)");
		state.execute("INSERT INTO  mytable values(3,'Mr wang3',26)");
		ResultSet rs = state.executeQuery("select * from mytable");
       	while(rs.next()){
       	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
       	}
       	state.execute("delete from mytable where id between 2 and 3");
	}	
 	catch(SQLException e1)
	{e1.printStackTrace();}
/*	finally	
	{
	  try{
	  rs.close();
	  state.close();
   	  connect.close();}
	  catch(SQLException e2)
	  {System.out.println(e2.getMessage());} 
	}	
*/	
	}
}
