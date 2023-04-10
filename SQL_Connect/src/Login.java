import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
    public static void main(){
        String name ;
        String password1;
        Scanner write = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = write.next();
        System.out.println("Enter your password ");
        password1 = write.next();
        String url = "jdbc:mysql://localhost:3306/sqlConnect";
        String username = "root";
        String password = "12345678";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet  resultSet = statement.executeQuery("select * from person where name = '"+name+"'and password ='"+password1+"'");

            if(resultSet.next()){
                System.out.println("Welcome");
                connection.close();
            }
            else {
                System.out.println("Sorry");
                connection.close();
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
