package exceptionsday6;
import java.sql.*;
public class exceptiondemo4 {
	
	static void method() throws SQLException{
		throw new SQLException("connection failed");
	}

	public static void main(String[] args) throws SQLException {
		method();
//		try {
//			method();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
	

	}

}
