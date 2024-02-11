package I3;


public class NaturalNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("The number you entered is not positive.");
        }
        System.out.println();
    }
}
