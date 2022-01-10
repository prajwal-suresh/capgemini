package postgresqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgresqlConnect {

	//jdbc url
	//jdbc username
	//jdbc password
	private final String url="jdbc:postgresql://localhost/Practise";
	private final String user="postgres";
	private final String password ="root";
	
	//Connection done- I will create a method to communication
	private void connect() {
		//Whether we deal with the server we always go for exception handling
		//Server may active, busy, not responsive......
		try {
			Connection connection= DriverManager.getConnection(url,user,password);
		    if(connection!=null) {
		     	System.out.println("Connected to postgresql server Successfully");
		    }else {
		    	System.out.println("Connection failed...........");
		    }
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDBCPostgresqlConnect sqlconnection=new JDBCPostgresqlConnect();
		sqlconnection.connect();
	}

}
