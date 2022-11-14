import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        String userNameIn = " ";
        String passWordIn = " ";
        System.out.print("- Username: ");
        //pick up username
        userNameIn = scan.nextLine();
        System.out.print("- Password: ");
        passWordIn = scan.nextLine();
        while(!userNameIn.equals(username) && !passWordIn.equals(password)){
            System.out.println("Incorrect please try again");
            System.out.print("- Username: ");
            //pick up username
            userNameIn = scan.nextLine();
            System.out.print("- Password: ");
            passWordIn = scan.nextLine();
            //pick up password
        }
        System.out.println("Sign in Succesful. Welcome");

        // see Learn the Part for the remaining instructions.
        
        
        /* will be useful for task 2
        
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();

        
        */
        scan.close();
        
    }
}
