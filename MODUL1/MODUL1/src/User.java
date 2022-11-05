import java.util.Scanner;

public class User {
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    
    public void userInput(){

        Scanner inputuser = new Scanner(System.in);
        
        System.out.print("Nama = ");
        String Name = inputuser.nextLine();

        System.out.print("No Handphone = ");
        int noHandphone = inputuser.nextInt();

        System.out.print("\nREGISTER SUCCESS\n");
        System.out.print("Name : "+Name+"\n");
        System.out.print("No Handphone : "+noHandphone+"\n");
    }

}
