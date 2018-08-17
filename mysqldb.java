import java.sql.*;

public class Mysqldb {
	void show()
	{
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost/niro","root","");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			//String sql="insert into sign "+" values('rit'+'niro')";
			//stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery("select * from sign");  
			while(rs.next())  
			{
				String username=rs.getString(1);
				String password=rs.getString(2);
			System.out.println(username+"  "+password); 
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);
			
			}  
		}
	
	public static void main(String args[]){  
	Mysqldb s=new Mysqldb();
	s.show();
}
}