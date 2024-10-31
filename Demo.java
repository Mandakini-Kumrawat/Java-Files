import java.sql.DriverManager;
import java.sql.SQLException ;
import java.sql.Connection ;
import java.sql.Statement;

public class Demo {
    public static void main ( String [] args ) throws SQLException {
        Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/xyz" , "root" , "mysql" ) ;
        if ( ! connection.isClosed () ) {
            System.out.println ( " Connected To Server " ) ;
        }
        // Creating A SQL Statement And Executing
        Statement statement = connection.createStatement () ;
        statement.execute ( " DELETE FROM JAVATABLE WHERE ID = 3 " ) ;
    }
}
