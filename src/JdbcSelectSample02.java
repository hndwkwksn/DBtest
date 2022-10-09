import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectSample02 {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=waku0630&allowPublicKeyRetrieval=true&useSSL=false";

    public static void main(String[] args) throws ClassNotFoundException {

	    try(Connection connection = DriverManager.getConnection(URL);
	    		PreparedStatement statement = connection.prepareStatement("select * from user where id = ?")) {
	    	statement.setLong(1, 1L);
	    	System.out.println(statement);
	    }  catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
