package Source_package;


import java.sql.*;

import javax.swing.JOptionPane;

public class Conn {
	public Connection c;
	public Statement s;
	
	public Conn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mysqldb","root","");
			s = c.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
