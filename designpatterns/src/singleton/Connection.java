package singleton;

public class Connection {
	static Connection con;
 private Connection() {
	 
 }
 public static Connection getConnection() {
	if(con !=null) 
	 return con;
	 else
	 con = new Connection();
	 return con;//singleton
	 //return new Connection(); //not a singleton becoz new objects are created becoz of  new
 }
}
