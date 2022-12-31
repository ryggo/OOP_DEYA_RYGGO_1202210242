import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation c = new Calculation();
        int pilihmenu;

        do {
            System.out.println("==Menu Program==\n1. Square\n2. Circle\n3. Trapezoid\n0. Finish");
            try {
                System.out.println("Select menu : ");
                pilihmenu = input.nextInt();
                switch(pilihmenu){
                    case 1:
                        System.out.println("Enter the length of side of the square : ");
                        double side = input.nextDouble();
                        c.setSquare(side);
                        c.run();
                        System.out.println("the calculation result : " +c.getSquare());
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle : ");
                        double radius = input.nextDouble();
                        c.setCircle(radius);
                        c.run();
                        System.out.println("the calculation result : " +c.getCircle());
                        break;
                    case 3:
                        System.out.println("insert the side of the base of the trapezoid : ");
                        double p = input.nextDouble();
                        System.out.println("enter the upper side of the trapezoid : ");
                        double l = input.nextDouble();
                        System.out.println("enter the height of the trapezoid : ");
                        double t = input.nextDouble();
                        c.setTrapezoid(p,l,t);
                        c.run();
                        System.out.println("the calculation result : " +c.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("program has ended.");
                        break;
                    default:
                        System.out.println("option not available");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e){
                System.out.println("==== ERROR : INPUT MUST BE A NUMBER ====");
                input.next();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while (repeat);
        input.close();
    }
}