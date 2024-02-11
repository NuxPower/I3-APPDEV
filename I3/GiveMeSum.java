package I3;

import java.util.Scanner;
import java.util.ArrayList;
public class GiveMeSum {
    static Scanner scan = new Scanner(System.in);
    static int naturalStart = 1;
    static int count = naturalStart + 1;

    public static ArrayList<Integer> arraylist(int n) {
        int i = naturalStart;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i <= n) {
            list.add(i);
            i++;
        }
        return list;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the number you want to sum up to: ");
        int x = scan.nextInt();
        ArrayList<Integer> numbers = arraylist(x);
        int sum = sum(numbers);
        System.out.println("The numbers you entered are: " + numbers);
        System.out.println("Sum of natural numbers from " + numbers.get(0) + " to " + numbers.get(numbers.size() - 1) + " is: " + sum);
    }
}
