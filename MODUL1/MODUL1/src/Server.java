import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO Create Database

        // TODO Create Menu
        Menu newMenu = new Menu();
        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User
        User newUser = new User();
        // Display Menu
        System.out.print("Selamat Datang di Restoran EAD\n Silahkan Register Terlebih Dahulu");
        System.out.print("Menu\n=============================================\n");
        newUser.userInput();

        boolean stat = true;
        while (stat == true){

            System.out.println("\n==============================\n");
            System.out.println("1. Menu\n2.Plih Menu\n3.Keluar");
            System.out.println("\n==============================\n");


            int pilih = input.nextInt();

            switch (pilih){
                case 1:
                    newMenu.menumenu();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Terima Kasih Sudah Datang");
                    stat = false;

            }

        }
    }
}
