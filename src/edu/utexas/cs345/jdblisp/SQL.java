import java.io.WriteAbortedException;
import java.io.Writer;
import java.sql.*;
public class SQL {
	
public static String SQLQuery(String query) {
		String username = "root";
		String password = "rascoot29";
		String tablename = "example";
		String fieldname = "*";
		//String query = "SELECT " + fieldname + " FROM " + tablename + " WHERE name = 'scooby doo';";
		String url = "jdbc:mysql://localhost/testing" ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con;
		String result = "";
		try {
			con = DriverManager.getConnection(url, username, password);
			result = executeQuery(con, query);
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;


}


private static String executeQuery(Connection con, String query){
	String result = "";
	try{
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		result = writeResultSet(rs);
		rs.close();
		stmt.close();
	}
	catch (SQLException e){
		System.out.println("Unable to execute query. Error: " + e.getMessage());
	}
	return result;
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



}



