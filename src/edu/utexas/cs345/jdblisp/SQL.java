package edu.utexas.cs345.jdblisp;
import java.io.WriteAbortedException;
import java.io.Writer;
import java.sql.*;
public class SQL {
	
	public static int SQLControl(String query) {
		Connection con = connect();
		Statement statement;
		int result = 0;
		try {
			statement = con.createStatement();
	    	result = statement.executeUpdate(query);
	    }
	    catch(SQLException e){
			sqlfail(e);
	    }
	    return result;
	}

	public static Str SQLQuery(String query){
		String result = "";
		Connection con = connect();
		try{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			result = writeResultSet(rs);
			rs.close();
			stmt.close();
		}
		catch (SQLException e){
			sqlfail(e);
		}
		return result;
	}

	private static Connection connect(){
		String username = "root";
		String password = "r00tmysql";
		String tablename = "example";
		String fieldname = "*";
		String url = "jdbc:mysql://localhost/testing" ;
		Connection con = null;
		String result = "";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return con;
	}

	private static String writeResultSet(ResultSet resultSet) throws SQLException {
		int count = resultSet.getMetaData().getColumnCount();
		String result = "";
		while (resultSet.next()) {
			String r = "";
			for(int i = 1; i <= count; i++)
				r += resultSet.getString(i) + ",";
			result += r.substring(0, r.length() -1) + "\n";
		}
		return result;
	}

	private static void sqlfail(SQLException e){
		System.out.println("Fail! Error: " + e.getMessage());
	}
}
