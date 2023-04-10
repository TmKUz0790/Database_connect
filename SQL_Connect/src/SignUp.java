import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SignUp {
    public static void main (){
        String name ;
        String password1;
        Scanner write = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = write.next();
        System.out.println("Enter your password: ");
        password1 = write.next();

        String url = "jdbc:mysql://localhost:3306/sqlConnect";
        String username = "root";
        String password = "12345678";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO PERSON(NAME , PASSWORD) values ('"+name+"','"+password1+"')";
            statement.execute(sql);
            connection.close();
            Login l = new Login();
            l.main();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
