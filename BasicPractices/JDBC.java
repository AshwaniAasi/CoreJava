import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail","root","12345");
            PreparedStatement ps1= con.prepareStatement("insert register value(05,'Rajesh','Delhi', 'Male');");
            ps1.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
