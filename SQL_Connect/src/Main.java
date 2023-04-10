import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int choice ;
        Scanner write = new Scanner(System.in);
        System.out.println("Welcome do you have account? \n   If you have press 1 \n   If hasn't press 2  ");
        choice = write.nextInt();
        if(choice ==1){
            Login login= new Login();
            login.main();

        } else if (choice==2) {
            SignUp signUp = new SignUp();
            signUp.main();

        }
    }
}