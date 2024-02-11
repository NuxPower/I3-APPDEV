package I3;

import java.util.Scanner;

public class Main {
    public static void choice(int choice, String[] args) {

        switch (choice) {
            case 1:
                GiveMeSum.main(args);
                break;
            case 2:
                NaturalNumbers.main(args);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean loop = true;
        System.out.println();
        while (loop) {
            System.out.println("1. Give me sum");
            System.out.println("2. Natural numbers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            choice(choice, args);
        }
    }
}
